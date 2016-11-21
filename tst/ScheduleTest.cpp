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

TEST(ScheduleTest, Given_A_Empty_Schedule_When_reserveAllDay_Then_Schedule_Full)
{
    Schedule tmpSchedule;
    tmpSchedule.reserve(Duartion("0", "24"));
    CHECK_TRUE(tmpSchedule.full());
}