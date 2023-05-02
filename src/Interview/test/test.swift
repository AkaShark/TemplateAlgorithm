public class Solution {
class MeetngTime {
    public var start: Int
    public var end: Int
    public init(_ start: Int, _ end: Int) {
        self.start = start
        self.end = end
    }
}
    func mergeMeetings ( _ meetings: [[Int]]) -> [[Int]] {
        var meetingsObj: [MeetngTime]
        for item in meetings {
            let obj: MeetngTime = MeetngTime(item[0], item[1])
            meetingsObj.append(obj)
        }
        let resObj: [MeetngTime] = p_merge(meetingTimes: meetingsObj)
        var res:[[Int]]
        for item in resObj {
            let time = [item.start, item.end]
            res.append(time)
        }
        return res
    }
    func p_merge(meetingTimes: [MeetngTime]) -> [MeetngTime] {
        //处理特殊情况
        guard meetingTimes.count > 1 else {
            return meetingTimes
        }
         //按开始的时间进行排序
        var times = meetingTimes.sorted { (s0:MeetngTime,s1:MeetngTime) -> Bool in
            
            if s0.start != s1.start {
                return s0.start < s1.start
            }else{
                return s0.end < s1.end
            }
        }
        
        //新建结果数组
        var res = [MeetngTime]()
        res.append(times[0])
        
        //遍历排序后的原数组，并与结果数组归并
        for i in 1..<times.count {
            let last = res[res.count - 1]
            let current = times[i]
            if current.start > last.end
            {
                res.append(current)
            }
            else
            {
               last.end = max(last.end, current.end)
            }
        
        }
        return res
    }
}