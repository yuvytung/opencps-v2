webpackJsonp([17],{288:function(t,e,a){var s=a(195)(a(359),a(366),null,null);t.exports=s.exports},359:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={data:function(){return{dossierTemplateIn:[{partNo:"1",partName:"Van ban abcxyz"},{partNo:"2",partName:"Van ban abcxyz"},{partNo:"3",partName:"Van ban abcxyz"}],dossierTemplateOut:[{partNo:"4",partName:"Van ban abcxyz"},{partNo:"5",partName:"Van ban abcxyz"},{partNo:"6",partName:"Van ban abcxyz"}],thongTinChiTietHoSo:{dossierIdCTN:"182CB683",receiveDate:1529409276e3,applicantName:"Lê việt Đức",dossierId:"67501",address:"Phường Tân Hồng, Thị xã Từ Sơn, Tỉnh Bắc Ninh",releaseDate:1529409276e3,dossierStatusText:"Đang xử lý",durationDate:3}}},computed:{loading:function(){return this.$store.getters.loading}},created:function(){},watch:{},methods:{initData:function(t){var e=this;e.$store.dispatch("getDetailDossier",t).then(function(t){e.thongTinChiTietHoSo=t,e.$store.dispatch("loadAllDossierTemplates",t).then(function(t){var a=t.filter(function(t){return 1===t.partType}),s=t.filter(function(t){return 2===t.partType});e.dossierTemplateIn=a,e.dossierTemplateOut=s,e.$store.dispatch("loadDossierFiles")})})},getDuedate:function(){var t=this,e=new Date(t.thongTinChungHoSo.dueDate).getTime()-new Date(t.thongTinChungHoSo.receiveDate).getTime();return Math.ceil(e/1e3/60/60/24)<=0?1:Math.ceil(e/1e3/60/60/24)},getCurentDateTime:function(t){var e=new Date;return"datetime"===t?e.getDate().toString().padStart(2,"0")+"/"+(e.getMonth()+1).toString().padStart(2,"0")+"/"+e.getFullYear()+" | "+e.getHours().toString().padStart(2,"0")+":"+e.getMinutes().toString().padStart(2,"0"):"date"===t?e.getFullYear()+"-"+(e.getMonth()+1).toString().padStart(2,"0")+"-"+e.getDate():void 0},goBack:function(){window.history.back()}},filters:{dateTimeView:function(t){if(t){var e=new Date(t);return e.getDate().toString().padStart(2,"0")+"/"+(e.getMonth()+1).toString().padStart(2,"0")+"/"+e.getFullYear()+" | "+e.getHours().toString().padStart(2,"0")+":"+e.getMinutes().toString().padStart(2,"0")}}}}},366:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[t.loading?a("content-placeholders",{staticClass:"mt-3"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("div",{staticClass:"row-header",staticStyle:{"margin-top":"6px"}},[a("div",{staticClass:"background-triangle-big"},[t._v(" Thông tin chung ")]),t._v(" "),a("div",{staticClass:"layout row wrap header_tools row-blue"},[a("div",{staticClass:"flex solo text-ellipsis"}),t._v(" "),a("div",{staticClass:"flex text-right",staticStyle:{"margin-left":"auto"}},[a("v-btn",{staticClass:"my-0 mx-0 btn-border-left",attrs:{flat:"","active-class":"temp_active"},on:{click:t.goBack}},[t._v("\n          Quay lại  \n          "),a("v-icon",{attrs:{size:"16"}},[t._v("undo")])],1)],1)])]),t._v(" "),a("v-layout",{attrs:{row:"",wrap:""}},[a("v-flex",{attrs:{xs12:"",sm12:""}},[a("v-card",{staticClass:"mb-2"},[a("v-card-title",{attrs:{"primary-title":""}},[a("v-layout",{attrs:{row:"",wrap:""}},[a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm6:""}},[a("span",[t._v("Loại hồ sơ: ")])]),t._v(" "),a("v-flex",{attrs:{xs12:"",sm6:""}},[a("v-chip",{staticClass:"pl-0",attrs:{small:""}},[t._v("\n                Hồ sơ trực tuyến\n              ")])],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm6:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Mã hồ sơ: "+t._s(t.thongTinChiTietHoSo.dossierIdCTN))])],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm6:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Ngày tiếp nhận: "+t._s(t.thongTinChiTietHoSo.receiveDate))])],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm6:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Chủ hồ sơ: "+t._s(t.thongTinChiTietHoSo.applicantName))])],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm6:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Mã số: "+t._s(t.thongTinChiTietHoSo.dossierId))])],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm12:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Địa chỉ: "+t._s(t.thongTinChiTietHoSo.address))])],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm12:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Ngày hẹn trả: "+t._s(t._f("dateTimeView")(t.thongTinChiTietHoSo.releaseDate)))]),t._v(" | "+t._s(t.thongTinChiTietHoSo.durationDate)+" ngày giải quyết\n            ")],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm12:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Trạng thái hồ sơ: "+t._s(t.thongTinChiTietHoSo.dossierStatusText))])],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm6:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Ngày hoàn thành: "+t._s(t._f("dateTimeView")(t.thongTinChiTietHoSo.releaseDate)))])],1),t._v(" "),a("v-flex",{staticClass:"mb-2",attrs:{xs12:"",sm6:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("span",[t._v("Ngày trả kết quả: "+t._s(t._f("dateTimeView")(t.thongTinChiTietHoSo.releaseDate)))])],1)],1)],1)],1),t._v(" "),t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-expansion-panel",{attrs:{expand:""}},[a("v-expansion-panel-content",{key:"1",attrs:{value:"false"}},[a("div",{attrs:{slot:"header"},slot:"header"},[t._v("Thành phần hồ sơ nộp vào")]),t._v(" "),a("div",{staticClass:"text-right",attrs:{slot:"header"},slot:"header"},[t._v("Xem tài liệu")]),t._v(" "),a("v-card",[a("v-card-text",{staticClass:"grey lighten-3"},t._l(t.dossierTemplateIn,function(e,s){return a("div",{key:e.partNo,staticClass:"mb-2"},[a("span",{staticClass:"text-bold mr-2"},[t._v(t._s(s+1)+".")]),t._v(" "),a("span",[t._v(t._s(e.partName)+" "),e.hasForm?a("i",[t._v("Form trực tuyến")]):t._e()])])}))],1)],1)],1),t._v(" "),t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-expansion-panel",{attrs:{expand:""}},[a("v-expansion-panel-content",{key:"1",attrs:{value:"false"}},[a("div",{attrs:{slot:"header"},slot:"header"},[t._v("Văn bản ban hành")]),t._v(" "),a("v-card",[a("v-card-text",{staticClass:"grey lighten-3"})],1)],1)],1),t._v(" "),t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-expansion-panel",{attrs:{expand:""}},[a("v-expansion-panel-content",{key:"1",attrs:{value:"false"}},[a("div",{attrs:{slot:"header"},slot:"header"},[t._v("Thành phần kết quả giải quyết")]),t._v(" "),a("div",{staticClass:"text-right",attrs:{slot:"header"},slot:"header"},[t._v("Xem tài liệu")]),t._v(" "),a("v-card",[a("v-card-text",{staticClass:"grey lighten-3"},t._l(t.dossierTemplateOut,function(e,s){return a("div",{key:e.partNo,staticClass:"mb-2",attrs:{slot:"header"},slot:"header"},[a("span",{staticClass:"text-bold mr-2"},[t._v(t._s(s+1)+".")]),t._v(" "),a("span",[t._v(t._s(e.partName))])])}))],1)],1)],1),t._v(" "),t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-expansion-panel",{attrs:{expand:""}},[a("v-expansion-panel-content",{key:"1",attrs:{value:"false"}},[a("div",{attrs:{slot:"header"},slot:"header"},[t._v("Tiến độ giải quyết")]),t._v(" "),a("v-card",[a("v-card-text",{staticClass:"grey lighten-3"})],1)],1)],1),t._v(" "),t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-expansion-panel",{attrs:{expand:""}},[a("v-expansion-panel-content",{key:"1",attrs:{value:"false"}},[a("div",{attrs:{slot:"header"},slot:"header"},[t._v("Nhật ký hồ sơ")]),t._v(" "),a("v-card",[a("v-card-text",{staticClass:"grey lighten-3"})],1)],1)],1),t._v(" "),t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-expansion-panel",{attrs:{expand:""}},[a("v-expansion-panel-content",{key:"1",attrs:{value:"false"}},[a("div",{attrs:{slot:"header"},slot:"header"},[t._v("Hỏi đáp trực tuyến")]),t._v(" "),a("v-card",[a("v-card-text",{staticClass:"grey lighten-3"})],1)],1)],1),t._v(" "),t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-expansion-panel",{attrs:{expand:""}},[a("v-expansion-panel-content",{key:"1",attrs:{value:"false"}},[a("div",{attrs:{slot:"header"},slot:"header"},[t._v("Trao đổi ý kiến trực tuyến")]),t._v(" "),a("v-card",[a("v-card-text",{staticClass:"grey lighten-3"})],1)],1)],1)],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=17.be25ca28f3c9cb416a8e.js.map