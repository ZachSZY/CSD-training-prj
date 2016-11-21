//
// Created by zhangfl on 2016/11/21.
//

#include "Player.h"

Reservation *Player::Reserve(const std::string& reservation_time) {
    m_reserve = new Reservation();
    m_reserve->setReservationTime(reservation_time);
    return m_reserve;
}

Player::~Player()
{
    delete m_reserve;
    m_reserve = _NULL;
}

