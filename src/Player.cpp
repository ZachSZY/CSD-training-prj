//
// Created by zhangfl on 2016/11/21.
//

#include "Player.h"

Reservation *Player::Reserve(Duartion const& duartion , Court const& court) {
    //if (court.isAvilable(duartion))
    {
        m_reserve = new Reservation();
        m_reserve->setDuartion(duartion);
       // m_reserve->setCourt(court);

    }
    return m_reserve;
}

Player::~Player()
{
    delete m_reserve;
    m_reserve = NULL;
}

Court Player::find_nearest_court() {
    return Court();
}

