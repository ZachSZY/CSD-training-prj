//
// Created by zhangfl on 2016/11/21.
//
#include "CppUTest/TestHarness.h"
#include "Player.h"

TEST_GROUP(tennis)
{

};

TEST(tennis, GEVIN_tennis_player_WHEN_reserva_THEN_get_one_reservation)
{
    Player player;
    Reservation * newReservation = player.Reserve();
    CHECK_TRUE(NULL != newReservation);
}

