//
// Created by zhangfl on 2016/11/21.
//

#include <string>
#include <iostream>
#include "Schedule.h"

Schedule::Schedule() {
   // this->m_duartionList.insert(0);
    for(int i = 0 ; i <= 23; i++)
    {
        m_hours.push_back(false);
    }
}

bool Schedule::reserve(Duartion const &duartion) {
    int start = atoi(duartion.Start().data());
    int end = atoi(duartion.End().data());
    std::cout<<start<< "" <<end<<std::endl;
    for(int i = start; i < end; i++)
    {
        m_hours[i] = true;
    }
    return false;
}

bool Schedule::full()
{
    for(int i = 0 ; i <= 23; i++)
    {
        std::cout<<m_hours[i]<<std::endl;
        if( !m_hours[i] ) {

            return false;
        }

    }
    return true;
}