package wenbingkun.com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wenbingkun.com.mapper.DeptMapper;
import wenbingkun.com.pojo.Dept;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptService {

    @Resource
    private DeptMapper deptMapper;

    public List<Dept> selectList(){return deptMapper.selectList(new QueryWrapper<Dept>());}

    public Dept getById(Long deptno){return deptMapper.selectById(deptno);}

}
