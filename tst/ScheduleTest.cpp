//
// Created by caryzhang on 16-11-21.
//

#include <CppUTest/UtestMacros.h>
#include <CppUTest/Utest.h>
#include "Schedule.h"
#include "Duartion.h"
TEST_GROUP(ScheduleTest)
{

};

TEST(ScheduleTest, Given_A_Full_Schedule_When_reserve_Then_Schedule_Changed)
{
    Schedule tmpSchedule;
    tmpSchedule.reserve(Duartion("0", "1"));
    CHECK_FALSE(tmpSchedule.full());
}