//
// Created by zhangfl on 2016/11/21.
//
#include "CppUTest/TestHarness.h"
#include "Player.h"
static Player* player;
TEST_GROUP(tennis)
{

    void setup()
    {
        player = new Player();
    }
    void teardown()
    {
        delete player;
    }
};

TEST(tennis, GEVIN_tennis_player_WHEN_reserva_THEN_get_one_reservation)
{
      Reservation * newReservation = player->Reserve();
    CHECK_TRUE(NULL != newReservation);
}

