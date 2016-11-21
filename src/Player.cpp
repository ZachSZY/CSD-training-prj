//
// Created by zhangfl on 2016/11/21.
//

#include "Player.h"

Reservation *Player::Reserve(Duartion const& duartion ) {
    m_reserve = new Reservation();
    m_reserve->setDuartion(duartion);

    return m_reserve;
}

Player::~Player()
{
    delete m_reserve;
    m_reserve = NULL;
}

