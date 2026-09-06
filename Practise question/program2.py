##merging overlapping intervals 
##[[1,3],[2,6],[8,10],[15,18]]


def merge_intervals(intervals):
    if not intervals:
        return []
    intervals.sort(key=lambda x:x[0])
    merged = [intervals[0]]

    for s , e in intervals[1:]:
        last_s, last_e = merged[-1]
        if s<=  last_e:
            merged[-1][-1] = max(last_e,e)
        else:
            merged.append([s,e])
    return merged
print(merge_intervals([[1,3],[2,6],[8,10],[15,20]]))