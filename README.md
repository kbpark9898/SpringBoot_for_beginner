# Spring boot project for beginner


이 프로젝트는 스프링부트를 사용하여 간단한 회원관리 시스템을 제작합니다.
<br>
기본적으로, 인프런 김영한 님의 스프링부트 입문 강의를 완벽히 이해하는 방식으로 진행됩니다.
<br>

해당 강의 링크 : 
https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8/dashboard

###1. 개요
시스템의 제작 과정은 다음과 같습니다.
<br>
1. 간단한 서비스 시나리오 설정
2. 회원정보를 관리할 수 있는 domain과 repository 생성
3. repository의 데이터를 변경할 수 있는 service code 제작
4. service code의 기능을 실제 실행시키는 controller 제작
5. 회원정보 입력 및 출력을 위한 페이지를 제공해주는 controller 제작
<br>


###2. 세부사항
- **실질적 java programming에 대한 이해**
  
해당 프로젝트는 복잡한 java programming logic을 사용하지 않습니다. 따라서, java programming에 대한 경험이 많지 않은 사람들에게
java와 친숙해질 수 있는 기회를 제공합니다.
<br>


- **mvc, api에 대한 이해**
  
mvc 모델에 입각한 코드를 작성하고, get, post 메소드를 직접 구현 및 호출해보며 해당 모델에대해
개괄적으로 이해합니다.

<br>

- **spring bean 의존성**

controller - service - repository의 관걔 형성을 위해 스프링 빈 의존성에 대해 학습하며, java annotation 을 이용한 방법과 직접 java code를 작성하여 bean configuration을 등록하는 방법을 모두 다룹니다.

<br>

- **데이터베이스 연동**

회원의 정보를 저장하는 repository를 초기에는 단순히 memory에 올리도록 구현합니다. 그 이후, SpringConfig을 통해 수동으로 spring bean 의존성을 주입하여 repository의 구성을 자유롭게 변경할 수 있도록 설계합니다. 
마지막으로, 앞서 구성한 memory repository를 순수 jdbc, spring jdbc template, jpa를 이용해 데이터베이스를 구성해보고, 의존성을 전환해봅니다.


<br>

- **AOP 이해**

생성한 스프링 컨테이너 내부의 의존성에 대해 AOP를 적용시켜 공통 관심 사항과 핵심 관심 사항을 구별하고, 해당 아키텍처를 이해합니다.
