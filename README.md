# awsdevday2023tokyo-sls-framework-web-adapter-native-image

## Result of K6

```
     data_received..................: 1.2 MB 445 kB/s
     data_sent......................: 163 kB 62 kB/s
     http_req_blocked...............: avg=231.9ms  min=171.56ms med=236.26ms max=301.01ms p(90)=286.31ms p(95)=292.03ms
     http_req_connecting............: avg=13.46ms  min=6.04ms   med=13.69ms  max=20.34ms  p(90)=18.95ms  p(95)=19.32ms 
     http_req_duration..............: avg=966.27ms min=876.18ms med=955.75ms max=1.42s    p(90)=1.01s    p(95)=1.05s   
       { expected_response:true }...: avg=966.27ms min=876.18ms med=955.75ms max=1.42s    p(90)=1.01s    p(95)=1.05s   
     http_req_failed................: 0.00%  ✓ 0         ✗ 200  
     http_req_receiving.............: avg=194.5µs  min=6µs      med=33µs     max=3.55ms   p(90)=442µs    p(95)=875.09µs
     http_req_sending...............: avg=70.47µs  min=21µs     med=44µs     max=1.02ms   p(90)=83.8µs   p(95)=121.24µs
     http_req_tls_handshaking.......: avg=193.57ms min=136.54ms med=195.63ms max=266.3ms  p(90)=247.66ms p(95)=253.83ms
     http_req_waiting...............: avg=966.01ms min=876.12ms med=955.64ms max=1.42s    p(90)=1.01s    p(95)=1.05s   
     http_reqs......................: 200    76.169526/s
     iteration_duration.............: avg=2.24s    min=2.16s    med=2.24s    max=2.62s    p(90)=2.28s    p(95)=2.28s   
     iterations.....................: 200    76.169526/s
     vus............................: 200    min=200     max=200
     vus_max........................: 200    min=200     max=200
```

## Result of CloudWatch Logs Insights

```
filter @type="REPORT" and ispresent(@initDuration)
| stats count() as coldStarts, avg(@maxMemoryUsed), avg(@duration + @initDuration) as totalDuration_avg, avg(@duration), avg(@initDuration), min(@initDuration), max(@initDuration) by bin(10m)
```
---
| coldStarts | avg(@maxMemoryUsed) | totalDuration_avg | avg(@duration) | avg(@initDuration) | min(@initDuration) | max(@initDuration) |
|------------|---------------------|-------------------|----------------|--------------------|--------------------|--------------------|
| 199        | 76542713.5678       | 584.3437          | 113.0003       | 471.3434           | 164.29             | 983.47             |
---
