//
// Created by zhangfl on 2016/11/21.
//

#ifndef CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_SCHEDULE_H
#define CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_SCHEDULE_H
//#include <set>
#include <vector>
#include "Duartion.h"


class Schedule {
public:
    Schedule();
    bool reserve(Duartion const& duartion);
    bool full() ; // if the schedule is full


private:
    //every element is a flag to indicate the one hour is occupied or not
   std::vector<bool>  m_hours;
};


#endif //CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_SCHEDULE_H
