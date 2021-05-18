package com.miniswing.svcservice;

import com.miniswing.svcservice.domain.Svc;
import com.miniswing.svcservice.domain.SvcRepository;
import com.miniswing.svcservice.web.dto.SvcSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SvcApiControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private SvcRepository svcRepository;

    @After
    public void tearDown() throws Exception{
        svcRepository.deleteAll();
    }

    @Test
    public void Svc_upload() throws Exception{
        SvcSaveRequestDto requestDto = SvcSaveRequestDto.builder()
                .svcmgmtnum(7100000007L)
                .feeprodid("스탠다드")
                .custnum("01020828962")
                .build();

        String url = "http://localhost:" + port + "/api/v1/svc";

        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, requestDto, Long.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isGreaterThan(0L);
        List<Svc> all = svcRepository.findAll();
        assertThat(all.get(0).getSvcmgmtnum()).isEqualTo(7100000007L);
        assertThat(all.get(0).getCustnum()).isEqualTo("01020828962");
    }
}
