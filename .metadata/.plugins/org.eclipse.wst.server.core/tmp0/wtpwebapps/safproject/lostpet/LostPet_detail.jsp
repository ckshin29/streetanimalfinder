<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lostpet/LostPet.css" type="text/css">
    <script src="https://code.jquery.com/jquery-latest.js"></script>
</head>

<body>
  <jsp:include page="/header/header.jsp"/>
    <div class="bg-light space-1">
        <div class="container g-mt-30 py-1 ">
            <div class="shadow-sm p-0">
                <h2 id="breadcrumb-title" class="h2 g-font-size-28 font-weight-bold g-line-height-1">보호동물 정보</h2>

                <div class="row te py-1">

                    <div class="col-lg-6">
                        <div class="js-slide g-bg-cover g-bg-black-opacity-0_1--after slick-slide"
                            style="height: 500px; width:100%;" id="img">
                            <!-- <img class="img-fluid w-100" src="/file/getBlob/23490.png" alt="Image Description"> -->
                        </div>




                    </div>

                    <div class="col-lg-6 g-pl-50--lg">


                        <h1 class="h3 g-color-primary font-weight-bold mt-4">
                            <!-- GA 클래스 추가 -->
                            <span class="animal_name">역삼동 / 개 (비글)</span>
                            <span
                                class="g-color-gray-dark-v5 g-font-weight-400 g-font-size-12 text-uppercase">D2015122001</span>
                        </h1>

                        <hr class="my-5">

                        <ul class="list-unstyled mb-0">
                            <li class="media mb-1">
                                <div class="d-flex w-40 w-sm-30">
                                    <small class="text-muted"> 종/품종 </small>
                                </div>
                                <div class="media-body">
                                    <h3 class="h6">개 / 진도</h3>
                                </div>
                            </li>
                            <li class="media mb-1">
                                <div class="d-flex w-40 w-sm-30">
                                    <small class="text-muted"> 성별(중성화) </small>
                                </div>
                                <div class="media-body">
                                    <h3 class="h6">암컷 / 중성화 O</h3>
                                </div>
                            </li>
                            <li class="media mb-1">
                                <div class="d-flex w-40 w-sm-30">
                                    <small class="text-muted"> 추정나이 </small>
                                </div>
                                <div class="media-body">


                                    <h3 class="h6">
                                        모름
                                    </h3>
                                </div>
                            </li>
                            <li class="media mb-1">
                                <div class="d-flex w-40 w-sm-30">
                                    <small class="text-muted"> 몸무게 </small>
                                </div>
                                <div class="media-body">
                                    <h3 class="h6">모름</h3>
                                </div>
                            </li>
                            <li class="media mb-1">
                                <div class="d-flex w-40 w-sm-30">
                                    <small class="text-muted"> 털색 </small>
                                </div>
                                <div class="media-body">
                                    <h3 class="h6">브라운</h3>
                                </div>
                            </li>
                            <li class="media mb-0">
                                <div class="d-flex w-40 w-sm-30">
                                    <small class="text-muted"> 발견 장소 </small>
                                </div>
                                <div class="media-body">
                                    <h3 class="h6 mb-0">역삼역 2번 출구 앞</h3>
                                </div>
                            </li>

                        </ul>

                        <hr class="my-5">



                        <div class="g-mt-10">
                            <!--버튼 -->

                            <button class="btn btn-block btn-primary openBtn" type="button">주인 /
                                발견
                                신고하기</button>

                        </div>

                    </div>
                </div>

            </div>

            <div class="container te">
                <h2 class="h5 text-dark font-weight-bold mb-3">설명</h2>
                <div class="row shadow-sm">
                    <div class="content te p-0">
                        <img class="img" src="/teamproject/WebContent/file/getBlob/23490.png"
                            style="height: 350px; width: 350px;">
                        <br>역삼역 2번 출구에서 사람 얼굴을 확인하고 다니고 있는 것을 보호했습니다. <br>
                        사람을 좋아해서 안 가리고 꼬리를 흔들던데... 목걸이도 하고 있는 걸 보니 주인이 계신것 같아서요
                        <br> 한번 올려봅니다.
                    </div>

                </div>

            </div>

            <div class="container te">
                <nav class="text-center " aria-label="Page Navigation">
                    <ul class="list-inline mb-0 f-0">
                        <li class="list-inline-item float-left">
                            <a class="primary--hover shadow-sm" href="" aria-label="이전글">이전글</a>
                        </li>
                        <li class="list-inline-item float-left">
                            <a class="primary--hover shadow-sm" href="LostPet.html" aria-label="목록">목록</a>
                        </li>
                        <li class="list-inline-item float-left">
                            <a class="primary--hover shadow-sm" href="" aria-label="다음글">다음글</a>
                        </li>
                    </ul>
                </nav>

            </div>

            <div class="container te shadow-sm line-border">
                <div class="container te mb-5">
                    <div class="mb-0">
                        <hr class="my-5">
                        <h3 class="h6 ">
                            댓글 1
                        </h3>
                        <hr class="my-4">
                    </div>
                    <div id="comment" class="media g-mb-30">
                        <div class="media-body">
                            <div class="d-flex">
                                <div class="d-block">
                                    <h5 class="h6 g-color-black g-font-weight-600">
                                        김나라
                                        <span class="g-color-gray-dark-v5 g-font-size-12 g-font-weight-400">
                                            2022-05-15 19:20
                                        </span>
                                    </h5>
                                </div>
                            </div>
                            <p>
                                앗 저 지나가다가 본거 같아요!!
                            </p>
                        </div>
                    </div>
                </div>
            </div>


        </div>

    </div>

    <div class="modal hidden">
        <div class="bg"></div>
        <div class="modalBox">
            <div class=" container  space-1  ">
                 <h3>신고 문자 보내기</h3>
                <div class="g-mb-20">
                    <label class="g-mb-20" for="name">보내는 이</label>
                    <input type="text" id="name" name="name" value="스트릿 애니멀 파인더"
                        class="form-control form-control-md rounded-0" readonly>
                </div>
                <form action="" method="get">
                    <div class="g-mb-20">
                        <label class="g-mb-20" for="content">내용</label>
                        <textarea id="content" class="form-control form-control-md rounded-0 "></textarea>
                    </div>
                    <div class="text-right center">
                        <button class="btn btn-primary  rounded-0 closeBtn" type="button">닫기</button>
                        <button class="btn btn-primary  rounded-0" type="reset">초기화</button>
                        <button class="btn btn-primary  rounded-0" type="submit">보내기</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
      <jsp:include page="/footer/footer.jsp"/>
    
</body>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=	62d4bc6d2093029dccfeeaaea8e0f9e8"></script>
<script>



    var mapContainer = document.getElementById('img'), // 지도를 표시할 div 
        mapOption = {
            center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
            level: 3 // 지도의 확대 레벨
        };

    // 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
    var map = new kakao.maps.Map(mapContainer, mapOption);


    // 지도에 표시할 원을 생성합니다
    var circle = new kakao.maps.Circle({
        center: new kakao.maps.LatLng(33.450701, 126.570667),  // 원의 중심좌표 입니다 
        radius: 100, // 미터 단위의 원의 반지름입니다 
        strokeWeight: 5, // 선의 두께입니다 
        strokeColor: '#75B8FA', // 선의 색깔입니다
        strokeOpacity: 1, // 선의 불투명도 입니다 1에서 0 사이의 값이며 0에 가까울수록 투명합니다
        strokeStyle: 'dashed', // 선의 스타일 입니다
        fillColor: '#CFE7FF', // 채우기 색깔입니다
        fillOpacity: 0.7  // 채우기 불투명도 입니다   
    });

    // 지도에 원을 표시합니다 
    circle.setMap(map);

    // 모달 
    const open = () => {
        document.querySelector(".modal").classList.remove("hidden");
    }

    const close = () => {
        document.querySelector(".modal").classList.add("hidden");
    }

    document.querySelector(".openBtn").addEventListener("click", open);
    document.querySelector(".closeBtn").addEventListener("click", close);
    document.querySelector(".bg").addEventListener("click", close);
</script>

</html>