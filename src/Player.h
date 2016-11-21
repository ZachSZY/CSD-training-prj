//
// Created by zhangfl on 2016/11/21.
//

#ifndef CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_PLAYER_H
#define CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_PLAYER_H

#include <string>
#include "Reservation.h"
#include "Duartion.h"

class Player
{
public:
    Reservation* Reserve(Duartion const& duartion );
    ~Player();
private:
    Reservation* m_reserve;
};
#endif //CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_PLAYER_H
