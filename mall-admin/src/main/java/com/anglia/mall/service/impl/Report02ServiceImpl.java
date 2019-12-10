package com.anglia.mall.service.impl;

import com.anglia.mall.interfaceImpl.ReportBehaviorService;
import org.springframework.stereotype.Service;

@Service("report02Service")
public class Report02ServiceImpl implements ReportBehaviorService {
    public String generate() {
        return "Report02Service";
    }
}
