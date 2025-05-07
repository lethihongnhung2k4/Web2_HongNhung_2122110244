package com.lethihongnhung.lethihongnhung.service;

import java.util.List;

import com.lethihongnhung.lethihongnhung.entity.Address;
import com.lethihongnhung.lethihongnhung.payloads.AddressDTO;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO);

    List<AddressDTO> getAddresses();

    AddressDTO getAddress(Long addressId);

    AddressDTO updateAddress(Long addressId, Address address);

    String deleteAddress(Long addressId);
}