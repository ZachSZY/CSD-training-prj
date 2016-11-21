//
// Created by zhangfl on 2016/11/21.
//
#include "CppUTest/TestHarness.h"
#include "Player.h"
#include "Duartion.h"
#include "Court.h"

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
    Duartion duartion(start_time, end_time);
    Court court;
    Reservation * newReservation = player->Reserve(duartion, court);
    CHECK_TRUE(NULL != newReservation);
}

TEST(tennis, GEVIN_tennis_player_WHEN_find_nearest_court_THEN_get_the_nearest_court)
{
    //given
    //when
    Court court = player->find_nearest_court();
    //then
    CHECK_TRUE(court.isValid());
}

TEST(tennis, GEVIN_a_normal_player_WHEN_repeat_reserve_daily_THEN_failure)
{
    //given
    //plyaer->setVip(true)
    std::string start_time = "2016-11-21 14:00;00";
    std::string end_time =  "2016-11-21 16:00;00";
    Duartion duartion(start_time, end_time);
    Court court;
    //when
    const int DAILY = 1;
    Reservation * newReservation = player->Reserve(duartion, court, DAILY);
    //then
    CHECK_TRUE(NULL == newReservation);
}



