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

TEST(tennis, GEVIN_tennis_player_WHEN_reserve_THEN_get_one_reservation)
{
    std::string reservation_time = "2016-11-21 14:00;00p";
    Reservation * newReservation = player->Reserve(reservation_time);
    CHECK_TRUE(NULL != newReservation);
}


