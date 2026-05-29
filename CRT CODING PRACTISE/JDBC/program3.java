import java.sql.*;

public class PlacementEliminationSystem {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/PlacementEliminationSystem",
                    "root",
                    ""
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            int size = 100;

            int[] id = new int[size];
            String[] name = new String[size];

            int[] coding = new int[size];
            int[] aptitude = new int[size];
            int[] communication = new int[size];
            int[] projects = new int[size];
            int[] hackathons = new int[size];

            int count = 0;

            while (rs.next()) {

                id[count] = rs.getInt("id");
                name[count] = rs.getString("name");

                coding[count] = rs.getInt("coding");
                aptitude[count] = rs.getInt("aptitude");
                communication[count] = rs.getInt("communication");
                projects[count] = rs.getInt("projects");
                hackathons[count] = rs.getInt("hackathons");

                count++;
            }

            String[] companyNames = new String[100];
            int[] techCutoff = new int[100];
            int[] commCutoff = new int[100];
            int[] projectCutoff = new int[100];
            int[] hiringLimit = new int[100];

            ResultSet companyRS = st.executeQuery("SELECT * FROM companies");

            int companyCount = 0;

            while (companyRS.next()) {

                companyNames[companyCount] =
                        companyRS.getString("company_name");

                techCutoff[companyCount] =
                        companyRS.getInt("technical_cutoff");

                commCutoff[companyCount] =
                        companyRS.getInt("communication_cutoff");

                projectCutoff[companyCount] =
                        companyRS.getInt("project_cutoff");

                hiringLimit[companyCount] =
                        companyRS.getInt("max_hiring");

                companyCount++;
            }

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO interview_result VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            );

            int[] round1 = new int[size];
            int[] round2 = new int[size];
            int[] round3 = new int[size];
            int[] finalScore = new int[size];

            String[] allocatedCompany = new String[size];
            String[] finalStatus = new String[size];

            int round1Eliminated = 0;
            int round2Eliminated = 0;
            int round3Eliminated = 0;

            int selected = 0;
            int rejected = 0;

            int highestScore = Integer.MIN_VALUE;
            int lowestScore = Integer.MAX_VALUE;

            int[] companyWiseCount = new int[100];

            System.out.println("=================================================");
            System.out.println("PLACEMENT ELIMINATION REPORT");
            System.out.println("=================================================");

            System.out.printf(
                    "%-5s %-10s %-5s %-5s %-5s %-7s %-15s %-20s%n",
                    "ID",
                    "NAME",
                    "R1",
                    "R2",
                    "R3",
                    "FINAL",
                    "COMPANY",
                    "STATUS"
            );

            for (int i = 0; i < count; i++) {

                round1[i] =
                        (coding[i] * 50 / 100)
                        + (projects[i] * 20)
                        + (hackathons[i] * 10);

                if (round1[i] < 70) {

                    allocatedCompany[i] = "NONE";
                    finalStatus[i] = "ELIMINATED ROUND-1";

                    round1Eliminated++;
                    rejected++;

                    System.out.printf(
                            "%-5d %-10s %-5d %-5s %-5s %-7s %-15s %-20s%n",
                            id[i],
                            name[i],
                            round1[i],
                            "-",
                            "-",
                            "-",
                            "-",
                            finalStatus[i]
                    );

                    continue;
                }

                round2[i] =
                        (communication[i] * 60 / 100)
                        + (aptitude[i] * 40 / 100);

                if (round2[i] < 75) {

                    allocatedCompany[i] = "NONE";
                    finalStatus[i] = "ELIMINATED ROUND-2";

                    round2Eliminated++;
                    rejected++;

                    System.out.printf(
                            "%-5d %-10s %-5d %-5d %-5s %-7s %-15s %-20s%n",
                            id[i],
                            name[i],
                            round1[i],
                            round2[i],
                            "-",
                            "-",
                            "-",
                            finalStatus[i]
                    );

                    continue;
                }

                round3[i] =
                        (coding[i]
                        + aptitude[i]
                        + communication[i]) / 3;

                if (round3[i] < 80) {

                    allocatedCompany[i] = "NONE";
                    finalStatus[i] = "ELIMINATED ROUND-3";

                    round3Eliminated++;
                    rejected++;

                    System.out.printf(
                            "%-5d %-10s %-5d %-5d %-5d %-7s %-15s %-20s%n",
                            id[i],
                            name[i],
                            round1[i],
                            round2[i],
                            round3[i],
                            "-",
                            "-",
                            finalStatus[i]
                    );

                    continue;
                }

                finalScore[i] =
                        (int)((round1[i] * 0.5)
                        + (round2[i] * 0.3)
                        + (round3[i] * 0.2));

                if (finalScore[i] > highestScore) {
                    highestScore = finalScore[i];
                }

                if (finalScore[i] < lowestScore) {
                    lowestScore = finalScore[i];
                }

                boolean placed = false;

                for (int j = 0; j < companyCount; j++) {

                    if (finalScore[i] >= techCutoff[j]
                            && communication[i] >= commCutoff[j]
                            && projects[i] >= projectCutoff[j]
                            && hiringLimit[j] > 0) {

                        allocatedCompany[i] =
                                companyNames[j];

                        finalStatus[i] =
                                "SELECTED";

                        hiringLimit[j]--;

                        companyWiseCount[j]++;

                        selected++;

                        placed = true;

                        break;
                    }
                }

                if (!placed) {

                    allocatedCompany[i] = "NONE";
                    finalStatus[i] = "REJECTED";

                    rejected++;
                }

                ps.setInt(1, id[i]);
                ps.setString(2, name[i]);
                ps.setInt(3, round1[i]);
                ps.setInt(4, round2[i]);
                ps.setInt(5, round3[i]);
                ps.setInt(6, finalScore[i]);
                ps.setString(7, allocatedCompany[i]);
                ps.setString(8, finalStatus[i]);

                ps.executeUpdate();

                System.out.printf(
                        "%-5d %-10s %-5d %-5d %-5d %-7d %-15s %-20s%n",
                        id[i],
                        name[i],
                        round1[i],
                        round2[i],
                        round3[i],
                        finalScore[i],
                        allocatedCompany[i],
                        finalStatus[i]
                );
            }

            System.out.println("=================================================");

            System.out.println(
                    "ROUND-1 ELIMINATED : "
                    + round1Eliminated
            );

            System.out.println(
                    "ROUND-2 ELIMINATED : "
                    + round2Eliminated
            );

            System.out.println(
                    "ROUND-3 ELIMINATED : "
                    + round3Eliminated
            );

            System.out.println(
                    "TOTAL SELECTED : "
                    + selected
            );

            System.out.println(
                    "TOTAL REJECTED : "
                    + rejected
            );

            System.out.println(
                    "HIGHEST FINAL SCORE : "
                    + highestScore
            );

            System.out.println(
                    "LOWEST FINAL SCORE : "
                    + lowestScore
            );

            System.out.println("=================================================");
            System.out.println("COMPANY WISE COUNT");
            System.out.println("=================================================");

            for (int i = 0; i < companyCount; i++) {

                System.out.println(
                        companyNames[i]
                        + " : "
                        + companyWiseCount[i]
                );
            }

            System.out.println("=================================================");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}