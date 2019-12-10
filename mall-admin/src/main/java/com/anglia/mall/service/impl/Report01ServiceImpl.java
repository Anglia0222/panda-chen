package com.anglia.mall.service.impl;

import com.anglia.mall.interfaceImpl.ReportBehaviorService;
import org.springframework.stereotype.Service;

@Service("reposrt01Service")
public class Report01ServiceImpl implements ReportBehaviorService {
    public String generate() {
        return "Report01Service";
    }
}
