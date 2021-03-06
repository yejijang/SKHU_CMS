<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="R" value="/" />

<div id="fh5co-hero">
	<a href="#fh5co-main"
		class="smoothscroll fh5co-arrow to-animate hero-animate-4"><i
		class="ti-angle-down"></i></a>
	<!-- End fh5co-arrow -->
	<div class="container">
		<div class="col-md-8 col-md-offset-2">
			<div class="fh5co-hero-wrap">
				<div class="fh5co-hero-intro">
					<h1 class="to-animate hero-animate-1">동아리 연합회</h1>
					<h2 class="to-animate hero-animate-2">동아리 연합회의 세부사항을 확인해 보세요!</h2>
				</div>
			</div>
		</div>
	</div>
</div>

<div id="fh5co-main">
	<div class="container">
		<div class="row">
			<div class="col-md-12 animate-box">
				<div id="fh5co-tab-feature-vertical" class="fh5co-tab">
					<ul class="resp-tabs-list hor_1">
						<li><i class="fh5co-tab-menu-icon ti-announcement"></i>동아리 관리</li>
						<li><i class="fh5co-tab-menu-icon ti-comment"></i>회계 관리</li>
						<li><i class="fh5co-tab-menu-icon ti-write"></i>공지 사항</li>
						<li><i class="fh5co-tab-menu-icon ti-announcement"></i>출석 체크</li>
						<li><i class="fh5co-tab-menu-icon ti-comment"></i>회의록</li>
					</ul>
					<div class="resp-tabs-container hor_1">
						<div>
							<div class="row">
								<div class="col-xs-12" style="margin-bottom: 0px">
									<h2 class="h3" style="margin-bottom: 0px">동아리 관리</h2>
									<ul class="pagination" style="margin-bottom: 0px">
										<li><a href="list" class="btn btn-primary btn-lg"
											id="l_search_term_btn">목록</a></li>
										<li><a href="create" class="btn btn-primary btn-lg"
											id="l_search_term_btn">개설</a></li>
									</ul>
								</div>
								<div class="col-xs-12">
									<table class="table table-striped " style="width: 550px">
										<tr class="text-center">
											<th colspan="3" style="text-align: center">목록</th>
										</tr>
										<c:forEach var="user" items="${users}">
											<tr style="text-align: center">
												<td style="text-align: left"><a>${user.name}</a></td>
												<!-- <td><a data-url="${R}edit?id=${user.id}"
													style="color: #1e00ff">비밀번호 수정</a></td> -->
												<td><c:choose>
														<c:when test="${user.id > 1}">
															<a href="delete?id=${user.id}" data-confirm-delete
																style="color: #ff0000">삭제</a>
														</c:when>
													</c:choose>
											</tr>
										</c:forEach>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>