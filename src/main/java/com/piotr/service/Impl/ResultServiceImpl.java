package com.piotr.service.Impl;

import com.piotr.dao.ResultDao;
import com.piotr.model.Result;
import com.piotr.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jalos on 02.05.2016.
 */

@Service
public class ResultServiceImpl implements ResultService {
   @Autowired
    private ResultDao resultDao;
    @Override
    public void save(Result result){// nic nie zwraca void
       resultDao.save(result); // stad zadnych RETURN !!!
    }
}
