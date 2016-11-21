//
// Created by zhangfl on 2016/11/21.
//

#include "Player.h"

Reservation *Player::Reserve(const std::string& start_time,const std::string& end_time ) {
    m_reserve = new Reservation();
    m_reserve->setBegin(start_time);
    m_reserve->setEnd(end_time);
    return m_reserve;
}

Player::~Player()
{
    delete m_reserve;
    m_reserve = NULL;
}

