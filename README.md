# 쿠빵 (Couppang) 프로젝트

🛍️ **쿠빵** - 상품을 검색하고, 인기검색어를 조회하며, 쿠폰을 빠르고 정확하게 발급하는 서비스  
🔰 **상품 조회, 인기검색어 조회, 선착순 동시 쿠폰 발급 시스템**  
**프로젝트 기간**: 2025/01/31 ~ 2025/02/07

## ⭐️ **스파르타 내일배움캠프 플러스 프로젝트** : 8조 ⭐️
![쿠팡 쿠폰 메인 이미지](https://github.com/llRosell/Coupang/blob/dev/%E1%84%8F%E1%85%AE%E1%84%91%E1%85%A1%E1%86%BC%20%E1%84%8F%E1%85%AE%E1%84%91%E1%85%A9%E1%86%AB%20%E1%84%86%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%AB.png?raw=true)

## 📚 **쿠빵 Team Notion 보러가기**
[쿠빵 Team Notion](https://teamsparta.notion.site/8-5c74090342f94d1bae575d1f6888cdc1)

## 📄 **발표 보고서 보러가기**
[발표 보고서](링크를_여기에_넣으세요)

## 🎬 **발표 영상 보러가기**
[발표 영상](링크를_여기에_넣으세요)


## 💬 **ERD**
![ERD 이미지](https://raw.githubusercontent.com/llRosell/Coupang/refs/heads/dev/ERD.webp)
</details>
---

## 프로젝트 목표

- **선착순 쿠폰 발급**: 대량 트래픽을 처리하며 빠르고 정확한 쿠폰 발급 서비스를 제공합니다.
- **분산 락을 통한 동시성 제어**: 선착순 쿠폰 발급 시스템을 구현하여 사용자들의 동시 요청을 처리합니다.
- **AWS 환경에서 배포**: EC2, RDS, 로드밸런싱, S3 및 도메인 관리 등 AWS 서비스를 활용하여 안정적이고 확장 가능한 시스템을 구축합니다.

---

## 📚 **기술 스택**

### Back-end
![Java](https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Redis](https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=redis&logoColor=white)
![Elasticsearch](https://img.shields.io/badge/elasticsearch-47A248?style=for-the-badge&logo=elasticsearch&logoColor=white)

- **Java**: Spring Boot 기반 서버 개발
- **Spring**: 의존성 주입 및 AOP, 트랜잭션 관리 등 다양한 엔터프라이즈 기능을 제공하는 프레임워크
- **Spring Boot**: 빠른 설정 및 간단한 구성을 통해 스프링 기반 애플리케이션을 개발할 수 있도록 돕는 프레임워크
- **Redis**: 세션 관리 및 분산 락을 통한 동시성 제어
- **MySQL**: AWS RDS에서 제공되는 관계형 데이터베이스
- **Elasticsearch**: 인기 검색어 순위 및 빠른 검색 기능 제공


### AWS
![EC2](https://img.shields.io/badge/amazon_ec2-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![RDS](https://img.shields.io/badge/amazon_rds-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Loadbalancer](https://img.shields.io/badge/amazon_loadbalancer-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![S3](https://img.shields.io/badge/amazon_s3-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Route 53](https://img.shields.io/badge/route_53-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)

- **EC2**: 애플리케이션 서버 운영
- **RDS**: 관계형 데이터베이스 관리
- **로드밸런싱**: 트래픽을 여러 EC2 인스턴스에 분산하여 처리
- **S3**: 이미지 및 기타 파일 저장 관리
- **도메인 관리**: AWS Route 53을 통해 도메인 설정

### Tools
![JMeter](https://img.shields.io/badge/jmeter-F5A500?style=for-the-badge&logo=apachejmeter&logoColor=white)
![Docker](https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Git](https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white)

- **JMeter**: 성능 테스트 및 로드 테스트를 통한 시스템 안정성 검증
- **Docker**: 개발 및 배포 환경을 컨테이너화하여 일관성 있는 개발 환경 제공
- **Git**: 버전 관리 시스템
- **GitHub**: GitHub을 사용한 협업 및 코드 관리

---

## 🏆 **서비스 성능**

### 대용량 트래픽 처리
- **가상 쿠폰 발급 사용자 1000명**, 쿠폰 100건 발급 시 **Redis 분산락** 이용하면 3초 이내

### 상품 조회 속도
- **상품 데이터 50만 건** 누적 후 페이지네이션 상품 조회 속도: **0.1초 이내**

### 검색 속도
- **최초 검색 속도**: 6초 (데이터 차지량에 따른 차이 발생)
- **캐싱 이후 검색 속도**: **0.1초 이내**

---

## 🔧 **성능 개선**

1. 💿 **DB 최적화**: 상품 데이터 조회 속도 개선
2. 🚀 **레디스 캐싱**: 데이터 캐싱을 통한 빠른 응답 처리
3. 🛣️ **부하 분산**: AWS 로드밸런싱을 활용한 부하 분산
4. 🔍 **Elasticsearch**: 엘라스틱 서치를 이용한 검색 속도 개선

<details>
  <summary>📊 Elasticsearch 성능 비교 결과 (클릭해서 보기)</summary>

![Elasticsearch 성능 비교](https://github.com/user-attachments/assets/0ee0141b-38c5-4f6b-84be-54a31de92d47)

| **검색 방법**                  | **설명**                         | **실행 속도 (ms)** |
  |--------------------------------|--------------------------------|-------------------|
| `getPopularKeywords()`         | 기본적인 검색어 집계            | **39ms**          |
| `getPopularKeywordsOptimized()` | 실행 힌트 적용 (`Map` 방식)     | **33ms**          |
| `getPopularKeywordsFastest()`   | 실행 힌트 + 쿼리 캐싱 적용      | **17ms**          |

- **최적화 결과**
    - 기본 검색 대비 **최대 2.3배 속도 향상**
    - `executionHint(TermsAggregationExecutionHint.Map)` 적용 시 **15% 속도 개선**
    - `requestCache(true)` 적용 후 **50% 추가 속도 개선**
    - 캐싱된 검색어 데이터를 활용하면 **0.1초 이내** 응답 가능

</details>


## 🔒 **트러블슈팅**

1. **SQL 최적화**: 검색 시 사용자가 선택한 조건의 조합에 따른 쿼리 적용 방법 고민
2. **동시성 제어**: 선착순 쿠폰 발급에 대한 데이터 정확성 확보
3. **AWS 배포 서버 중단 문제**: AWS EC2 인스턴스 중단 대응

---

## 📈 **추가 개선 가능 점**

- **대기열 시스템**: 대량의 트래픽이 몰리는 것을 방지하는 대기열 시스템 추가 예정
- **트래픽 이벤트 처리**: 트래픽이 몰릴 이벤트 상품 데이터를 미리 캐싱하여 빠른 처리 지원
- **ElasticSearch 도입**: 대용량 데이터 환경에서 뛰어난 성능을 보이는 검색 기능 도입

---

## 🤝 **팀원**

| 이름   | 깃허브                                                   |
|--------|---------------------------------------------------------|
| 최대현 | [https://github.com/DeaHyun0911](https://github.com/DeaHyun0911) |
| 김리은 | [https://github.com/llRosell](https://github.com/llRosell) |
| 최순우 | [https://github.com/asdd2557](https://github.com/asdd2557) |
| 이경훈 | [https://github.com/kyung412820](https://github.com/kyung412820) |

---

