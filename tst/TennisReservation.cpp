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
    std::string start_time = "2016-11-21 14:00;00";
    std::string end_time =  "2016-11-21 16:00;00";
    Reservation * newReservation = player->Reserve(start_time, end_time);
    CHECK_TRUE(NULL != newReservation);
}


