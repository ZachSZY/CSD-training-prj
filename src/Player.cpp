//
// Created by zhangfl on 2016/11/21.
//

#include "Player.h"

Reservation *Player::Reserve() {
    m_reserve = new Reservation();
    return m_reserve;
}

Player::~Player()
{
    delete m_reserve;
}

