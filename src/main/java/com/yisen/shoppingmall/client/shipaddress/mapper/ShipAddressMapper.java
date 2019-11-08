package com.yisen.shoppingmall.client.shipaddress.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.Address;

import java.util.List;

public interface ShipAddressMapper {
    List<Address> querySomeAddress(@Param("id") int id);
    int addAddress(Address address);
    int delAddress(Address address);
    int updateAddress(Address address);
}
