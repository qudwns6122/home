package com.example.demo.service;

import com.example.demo.entity.MyInfo;
import com.example.demo.entity.VueBoard;

import java.util.List;

public interface MyInfoService {
    public Boolean register(MyInfo myInfo) throws Exception;
//    public VueBoard read(Long info_id) throws Exception;
//    public void modifsy(MyInfo myInfo) throws Exception;
    public void remove(VueBoard vueBoard,Long userNo) throws Exception;
    public List<VueBoard> list(Long userNo) throws Exception;
}
