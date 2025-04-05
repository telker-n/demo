package com.banker.demo.pojo;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import java.util.*;

@Component
public class BankDataStructure {
    Map<String, UserProfile> userMap = new HashMap<>();
    Map<String, Transaction> txnMap = new TreeMap<>();

    Map<String, Account> accMap = new HashMap<>();

}
