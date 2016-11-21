//
// Created by zhangfl on 2016/11/21.
//

#ifndef CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_RESERVATION_H
#define CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_RESERVATION_H

class Reservation
{
private:
    std::string m_start;
    std::string m_end;
public:
    void setBegin(const std::string &basic_string);

    void setEnd(const std::string &basic_string);
};
#endif //CSD_TRAINING_PRJ_CPLUSPLUS_2016NOV_RESERVATION_H
