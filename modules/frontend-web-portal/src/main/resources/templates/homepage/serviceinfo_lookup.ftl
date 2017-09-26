<div class="row">
	<div class="col-sm-9 col-sm-offset-1 text-center searchbar">
		<h3 class="text-blue"><i>HỆ THỐNG DỊCH VỤ CÔNG TRỰC TUYẾN</i></h3>
		<div class="input-group MB15">
			<input id="input_search_serviceinfo" type="text" class="form-control" placeholder="Nhập tên thủ tục hành chính">
			<div class="input-group-btn">
				<button class="btn btn-default" type="submit">
					<i class="glyphicon glyphicon-search"></i>
				</button>
			</div>
		</div>
	</div>
	<div class="col-sm-11">
		<div class="eq-height-lg">
			<div class="row" id="imgDomains">
				<div class="img-domains col-sm-4">
					<div class="pic-1"></div>
					<div class="center-all">
						<a href="">Lĩnh vực <span>VĂN HÓA</span></a>
					</div>
				</div>
				<div class="img-domains col-sm-4">
					<div class="pic-2"></div>
					<div class="center-all">
						<a href="">Lĩnh vực <span>THỂ DỤC - THỂ THAO</span></a>
					</div>
				</div>
				<div class="img-domains col-sm-4">
					<div class="pic-3"></div>
					<div class="center-all">
						<a href="">Lĩnh vực <span>DU LỊCH</span></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	$("#input_search_serviceinfo").kendoAutoComplete({
		dataSource: {
			transport :{
				read : {
					url : "${api.server}/serviceinfos",
					dataType : "json",
					type : "GET",
					beforeSend: function(req) {
						req.setRequestHeader('groupId', ${groupId});
					},
					success : function(result){

					},
					error : function(xhr){

					}
				}
			},
			schema : {
				data : "data",
				total : "total"
			}
		},
		dataTextField: "serviceName",
		filter: "startswith",
		placeholder: "Nhập từ khóa"
	});
</script>