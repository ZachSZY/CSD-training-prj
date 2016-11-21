cmake_minimum_required(VERSION 3.6)
project(CSD_training_prj)
include_directories("/home/caryzhang/sandbox/cpputest-master/include")
include_directories("/home/caryzhang/sandbox/gitrep/CSD-training-prj")
include_directories("/home/caryzhang/sandbox/gitrep/CSD-training-prj/src")
include_directories("/home/caryzhang/sandbox/gitrep/CSD-training-prj/tst")
link_directories("/home/caryzhang/sandbox/cpputest-master/lib")
link_libraries("/home/caryzhang/sandbox/cpputest-master/lib/libCppUTest.a")
link_libraries("/home/caryzhang/sandbox/cpputest-master/lib/libCppUTestExt.a")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -lCppUTest -lCppUTestExt")


set(SOURCE_FILES
    build/ComponentMakefile
    build/MakefileWorker.mk
    src/CircularBuffer.cpp
    src/CircularBuffer.h
    src/One.cpp
    src/One.h
    src/Printer.cpp
    src/Printer.h
    src/Reservation.h
    src/Player.cpp
    src/Player.h
    src/Court.cpp
    src/Court.h
    src/Duartion.cpp
    src/Duartion.h
    src/Schedule.cpp
    src/Schedule.h
    src/Postion.cpp
    src/Postion.h
    src/Reservation.h
    src/Reservation.cpp
    tst/AllTests.cpp
    tst/AllTests.h
    tst/CircularBufferTest.cpp
    tst/MockDocumentationTest.cpp
    tst/MockPrinter.h
    tst/OneTest.cpp
    tst/PrinterTest.cpp tst/ScheduleTest.cpp)

add_executable(CSD_training_prj ${SOURCE_FILES})