package com.marshal.epoch.system.controller;


import com.marshal.epoch.core.dto.ResponseEntity;
import com.marshal.epoch.core.util.ResponseUtil;

import com.marshal.epoch.system.entity.SysMenu;
import com.marshal.epoch.system.api.SysMenuApi;
import com.marshal.epoch.system.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class SysMenuController implements SysMenuApi{

    @Autowired
    private SysMenuService service;

    public ResponseEntity query(SysMenu dto,
        int pageNum,
        int pageSize) {
        return ResponseUtil.responseOk(service.select(dto,pageNum,pageSize));
    }

    public ResponseEntity submit(SysMenu dto){
        service.submit(dto);
        return ResponseUtil.responseOk();
    }

    public ResponseEntity remove(List<SysMenu> list) {
        service.batchDelete(list);
        return ResponseUtil.responseOk();
    }
}