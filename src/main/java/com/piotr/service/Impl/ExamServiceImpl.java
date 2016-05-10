package com.piotr.service.Impl;

import com.piotr.dao.ExamDao;
import com.piotr.model.Exam;
import com.piotr.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jalos on 02.05.2016.
 */

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamDao examDao ;

    @Override
    public List<Exam> findAll() {
        return examDao.findAll();
    }
}
