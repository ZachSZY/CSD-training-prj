//
// Created by zhangfl on 2016/11/21.
//


#include <string>
#include "Reservation.h"

void Reservation::setBegin(const std::string &basic_string) {
    m_start = basic_string;
}

void Reservation::setEnd(const std::string &basic_string) {
    m_end = basic_string;
}
