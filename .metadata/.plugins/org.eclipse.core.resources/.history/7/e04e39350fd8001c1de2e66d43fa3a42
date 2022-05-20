<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/board/LostPet.css" type="text/css">
</head>

<body>
  <jsp:include page="/header/header.jsp"/>

    <div class="dzsparallaxer auto-init height-is-based-on-content use-loading mode-scroll loaded dzsprx-readyall g-bg-cover"
        data-options="{direction: &quot;reverse&quot;, animation_duration: 25, direction: &quot;reverse&quot;}">
        <div class="divimage dzsparallaxer--target w-100 u-bg-overlay g-bg-img-hero g-bg-black-opacity-0_3--after"
            style="height: 130%; background-image: url(/file/getBlob/130690_90612_406.jpg); transform: translate3d(0px, -90px, 0px);">
            ::before
            ::after
        </div>
        <!--글쓰기 버튼-->
        <div class="container u-bg-overlay__inner g-py-100">
            <h2 class="g-color-white g-font-size-24 g-font-weight-600">게시판 목록</h2><br>
            <div class="g-color-white g-pt-10 g-pb-20">
                <p class="g-color-white g-font-size-18 g-pb-30">이웃과 함께 만드는 커뮤니티 <br> 주변 반려인의 이웃이 되어 주세요 <br> </p>
                <div class="row">
                    <!--<div class="col-4">
                        <a href="${pageContext.request.contextPath}/lostpet/find_write.jsp" class="btn btn-md btn-block btn-outline-light g-mr-10 g-mb-15">글쓰기</a>
                    </div>-->
                    <div class="col-4">
                        <!-- GA 클래스 추가 -->
                        <a href="${pageContext.request.contextPath}/board/new-write.jsp"
                            class="btn btn-md btn-block btn-primary g-color-white g-mr-10 g-mb-15 g-brd-0 adopt_application_event">
                            글쓰기
                        </a>
                    </div>
                    
                </div>
            </div>
        </div>
        ::after
    </div>

    <!-- 목록 -->
    <div class="container space-1">
        
        <div class="row">
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="${pageContext.request.contextPath}/board/new-write-detail.jsp">
                        <div id="img1" class="image-box card-img-top" name="img" style="width:100%;height:220px;">
                            <img class="image-thumbnail" src="logo.svg">
                            <!-- * 상위 div 에 꽉 채우고 싶다.
                                * 비율이 깨지지 않도록 한다.
                                * 이미지의 가운데 부분이 보여지도록 한다.
                                * 넘치는 부분은 자른다.
                                width: 380px, height: 220px 인 상위 div 가 있다.
                                이 div 에 딱 맞게 어떤 비율의 이미지든 맞춰서 꽉차게 넣고 싶은 경우.
                                극단적인 예시로 width: 1000px, height: 20px 인 이미지를 width: 380px, height: 220px 인 div 에 딱 맞게 넣으려면
                                비율이 사정없이 깨질테니 가운데 부분만 보여주고 div 에 들어가지 않는 나머지 영역은 자르기로 한다.
                                포인트)
                                1. 상위 div 에 일정한 사이즈 width, height 및 overflow:hidden 을 주어 이미지 태그가 해당 사이즈를 벗어나면 잘리도록 한다.
                                2. 이미지 태그는 원본 비율을 유지하도록 width: 100%, height: 100% 를 주고,
                                상위 div 크기에 딱 맞아 들어가도록 object-fit: cover; 를 부여한다. -->
                        </div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/board/new-write-detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="${pageContext.request.contextPath}/board/new-write-detail.jsp">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/board/new-write-detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>
            <div class="col-sm-6 col-md-3 mb-7">
                <div class="card border-0 shadow-soft h-100">
                    <a href="">
                        <div id="img1" class="card-img-top" name="img" style="width:100%;height:220px;"></div>
                    </a>
                    <div class="card-body p-3">
                        <h2 class="h5 font-weight-bold"><a href="${pageContext.request.contextPath}/lostpet/LostPet_detail.jsp">글 제목</a></h2>
                        <p class="text-secondary mb-0">
                            이름(닉네임)<br>
                            작성시간(시:분)
                            조회 (숫자) <br>

                        </p>
                    </div>

                </div>
            </div>

            

        </div>
    </div>


  <jsp:include page="/footer/footer.jsp"/>

</body>


</html>