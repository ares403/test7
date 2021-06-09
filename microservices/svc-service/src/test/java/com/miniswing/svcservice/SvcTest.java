package com.miniswing.svcservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SvcTest {
//    @Autowired
//    SvcRepository svcRepository;
//
//    @Test
//    public void 안녕(){
//        svcRepository.save(Svc.builder()
//                .svcmgmtnum(7100000007L)
//                .feeprodid("스탠다드5G")
//                .custnum("01020828962")
//                .build());
//
//        List<Svc> svcList = svcRepository.findAll();
//        Svc svc = svcList.get(0);
//        assertThat(svc.getSvcmgmtnum()).isEqualTo(7100000007L);
//    }

//    //    @Transactional
//    @org.junit.Test
//    public void SVC_join() throws Exception{
//        Svc savedSvc = Svc.builder()
//                .svcmgmtnum(7100000007L)
//                .feeprodid("A00001")
//                .custnum("01020828962")
//                .build();
//        List<Svc> list= new ArrayList<>();
//        list.add(savedSvc);
//        Prod prod = Prod.builder()
//                .prodid("A00001")
//                .prodnm("스탠다드")
//                .coclcd("T")
//                .svc(list)
//                .build();
////
//        prodRepository.save(prod);
//
////        System.out.println(prodRepository.findAll().get(0).getSvc().get(0).getSvcmgmtnum());
////
////
//        System.out.println(svcRepository.findAll().get(0).getProd().getProdnm());
//
//    }
}
