//
// Created by zhangfl on 2016/11/21.
//

#include <string>
#include "Schedule.h"

Schedule::Schedule() {
   // this->m_duartionList.insert(0);
    for(int i = 0 ; i < 23; i++)
    {
        m_hours.push_back(false);
    }
}

bool Schedule::reserve(Duartion const &duartion) {
    return false;
}

bool Schedule::full()
{
    for(int i = 0 ; i < 23; i++)
    {
        if( !m_hours[i] )
            return false;
    }
}