(function(e){function t(t){for(var s,o,i=t[0],l=t[1],c=t[2],u=0,d=[];u<i.length;u++)o=i[u],r[o]&&d.push(r[o][0]),r[o]=0;for(s in l)Object.prototype.hasOwnProperty.call(l,s)&&(e[s]=l[s]);p&&p(t);while(d.length)d.shift()();return n.push.apply(n,c||[]),a()}function a(){for(var e,t=0;t<n.length;t++){for(var a=n[t],s=!0,i=1;i<a.length;i++){var l=a[i];0!==r[l]&&(s=!1)}s&&(n.splice(t--,1),e=o(o.s=a[0]))}return e}var s={},r={app:0},n=[];function o(t){if(s[t])return s[t].exports;var a=s[t]={i:t,l:!1,exports:{}};return e[t].call(a.exports,a,a.exports,o),a.l=!0,a.exports}o.m=e,o.c=s,o.d=function(e,t,a){o.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:a})},o.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},o.t=function(e,t){if(1&t&&(e=o(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var a=Object.create(null);if(o.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var s in e)o.d(a,s,function(t){return e[t]}.bind(null,s));return a},o.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return o.d(t,"a",t),t},o.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},o.p="/";var i=window["webpackJsonp"]=window["webpackJsonp"]||[],l=i.push.bind(i);i.push=t,i=i.slice();for(var c=0;c<i.length;c++)t(i[c]);var p=l;n.push([0,"chunk-vendors"]),a()})({0:function(e,t,a){e.exports=a("56d7")},"56d7":function(e,t,a){"use strict";a.r(t);var s=a("a026"),r=a("ce5b"),n=a.n(r);s["default"].use(n.a,{theme:{primary:"#212121",secondary:"#424242",accent:"#459fed",error:"#ff8e8e",info:"#2196F3",success:"#4CAF50",warning:"#FFC107"}});a("ca9a"),a("a51b"),a("c35c"),a("861c");var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v-app",{class:{"theme--dark":!0,close__drawer_bbat:!e.drawer},attrs:{id:"app"}},[a("v-content",[a("router-view")],1)],1)},i=[],l={data:function(){return{}},computed:{user:function(){return this.$store.getters.user},drawer:function(){return this.$store.getters.drawer}}},c=l,p=a("2877"),u=Object(p["a"])(c,o,i,!1,null,null,null);u.options.__file="App.vue";var d=u.exports,m=a("8c4f"),v=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v-app",[a("v-form",{ref:"form",staticClass:"py-3 px-3 grid-list",attrs:{"lazy-validation":""},model:{value:e.valid,callback:function(t){e.valid=t},expression:"valid"}},[a("v-layout",{staticClass:"user_profile",staticStyle:{"max-width":"1300px",margin:"0 auto"},attrs:{wrap:""}},[a("v-flex",{staticClass:"xs12 sm8"},[a("v-card",{staticStyle:{"border-radius":"4px","-webkit-box-shadow":"0 0 2rem 0 rgba(136,152,170,.15)!important","box-shadow":"0 0 2rem 0 rgba(136,152,170,.15)!important"}},[a("v-toolbar",{attrs:{color:"blue darken-3",dark:"",height:"48"}},[a("v-btn",{attrs:{dark:"",flat:""}},[a("v-icon",[e._v("verified_user")]),e._v("   \n              "),0===e.state?a("span",[e._v("\n                Thông tin tài khoản\n              ")]):a("span",[e._v("\n                Đổi mật khẩu\n              ")])],1),a("v-spacer"),0===e.state?a("v-btn",{staticClass:"mr-2",attrs:{dark:"",flat:""},on:{click:e.submitUserProfile}},[a("v-icon",[e._v("done")]),e._v("   Cập nhật thông tin\n            ")],1):a("v-btn",{staticClass:"mr-2",attrs:{dark:"",flat:""},nativeOn:{click:function(t){return e.doChangePassWord(t)}}},[a("v-icon",[e._v("done")]),e._v("   Xác nhận đổi mật khẩu\n            ")],1)],1),1===e.state?a("v-layout",{staticClass:"py-3",attrs:{row:"","justify-center":"",wrap:""}},[a("v-flex",{attrs:{xs12:"",sm3:""}}),a("v-flex",{attrs:{xs12:"",sm6:""}},[e.changePassWordFail?a("v-alert",{attrs:{value:!0,color:"error",icon:"warning",outline:""}},[e._v("\n                Mật khẩu cũ không chính xác.\n              ")]):e._e()],1),a("v-flex",{attrs:{xs12:"",sm3:""}}),a("v-flex",{attrs:{xs12:"",sm3:""}}),a("v-flex",{attrs:{xs12:"",sm6:""}},[a("v-text-field",{attrs:{label:"Mật khẩu cũ 💥",type:"password",box:"",rules:[function(e){return!!e||"Trường dữ liệu bắt buộc"}],required:""},model:{value:e.oldPassWord,callback:function(t){e.oldPassWord=t},expression:"oldPassWord"}})],1),a("v-flex",{attrs:{xs12:"",sm3:""}}),a("v-flex",{attrs:{xs12:"",sm3:""}}),a("v-flex",{attrs:{xs12:"",sm6:""}},[a("v-text-field",{attrs:{label:"Mật khẩu mới 💥",type:"password",box:"",rules:[function(e){return!!e||"Trường dữ liệu bắt buộc"}],required:""},model:{value:e.newPassWord,callback:function(t){e.newPassWord=t},expression:"newPassWord"}})],1),a("v-flex",{attrs:{xs12:"",sm3:""}}),a("v-flex",{attrs:{xs12:"",sm3:""}}),a("v-flex",{attrs:{xs12:"",sm6:""}},[a("v-text-field",{attrs:{label:"Nhập lại mật khẩu mới 💥",type:"password",box:"",rules:[function(e){return!!e||"Trường dữ liệu bắt buộc"},function(t){return t===e.newPassWord||"Mật khẩu nhập lại không chính xác"}],required:""},model:{value:e.newPassWordConfirm,callback:function(t){e.newPassWordConfirm=t},expression:"newPassWordConfirm"}})],1),a("v-flex",{attrs:{xs12:"",sm3:""}}),a("v-flex",{attrs:{xs12:"",sm6:""}},[a("v-btn",{staticClass:"mx-0",attrs:{block:"",color:"blue darken-3",dark:"",loading:e.loading,disabled:e.loading},nativeOn:{click:function(t){return e.doChangePassWord(t)}}},[a("v-icon",[e._v("done")]),e._v("  Xác nhận đổi mật khẩu\n              ")],1)],1)],1):e._e(),0===e.state&&"org.opencps.usermgt.model.Applicant"===e.user["className"]?a("v-layout",{staticClass:"px-3 py-3",attrs:{row:"",wrap:""}},[a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Tên người dùng 💥",box:"",rules:[function(e){return!!e||"Trường dữ liệu bắt buộc"}],required:""},model:{value:e.user["applicantName"],callback:function(t){e.$set(e.user,"applicantName",t)},expression:"user['applicantName']"}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Điện thoại",box:""},model:{value:e.user["applicantContactTelNo"],callback:function(t){e.$set(e.user,"applicantContactTelNo",t)},expression:"user['applicantContactTelNo']"}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Thư điện tử",box:"",disabled:""},model:{value:e.user["applicantContactEmail"],callback:function(t){e.$set(e.user,"applicantContactEmail",t)},expression:"user['applicantContactEmail']"}})],1),"business"===e.user["applicantType"]?a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Mã số thuế",box:"",disabled:""},model:{value:e.user["applicantIdNo"],callback:function(t){e.$set(e.user,"applicantIdNo",t)},expression:"user['applicantIdNo']"}})],1):e._e(),"business"===e.user["applicantType"]?a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Ngày cấp",box:"",disabled:""},model:{value:e.user["applicantIdDate"],callback:function(t){e.$set(e.user,"applicantIdDate",t)},expression:"user['applicantIdDate']"}})],1):e._e(),a("v-flex",{attrs:{xs12:"",sm12:""}},[a("v-textarea",{attrs:{label:"Địa chỉ",box:"",clearable:""},model:{value:e.user["applicantAddress"],callback:function(t){e.$set(e.user,"applicantAddress",t)},expression:"user['applicantAddress']"}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-autocomplete",{attrs:{items:e.cityItems,label:"Tỉnh/thành phố","item-text":"itemName","item-value":"itemCode","hide-selected":!0,box:""},on:{change:function(t){e.onChangeCity(t)}},model:{value:e.user["applicantCityCode"],callback:function(t){e.$set(e.user,"applicantCityCode",t)},expression:"user['applicantCityCode']"}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-autocomplete",{attrs:{items:e.districtItems,label:"Quận/huyện","item-text":"itemName","item-value":"itemCode","hide-selected":!0,box:""},on:{change:function(t){e.onChangeDistrict(t)}},model:{value:e.user["applicantDistrictCode"],callback:function(t){e.$set(e.user,"applicantDistrictCode",t)},expression:"user['applicantDistrictCode']"}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-autocomplete",{attrs:{label:"Xã/phường",items:e.wardItems,"item-text":"itemName","item-value":"itemCode","hide-selected":!0,box:""},model:{value:e.user["applicantWardCode"],callback:function(t){e.$set(e.user,"applicantWardCode",t)},expression:"user['applicantWardCode']"}})],1),a("v-flex",{staticClass:"text-xs-right",attrs:{sm12:""}},[a("v-btn",{staticClass:"mx-0",attrs:{color:"blue darken-3",loading:e.loading,disabled:e.loading,dark:""},on:{click:e.submitUserProfile}},[a("v-icon",[e._v("done")]),e._v("  Cập nhật thông tin\n              ")],1)],1)],1):e._e(),0===e.state&&"org.opencps.usermgt.model.Employee"===e.user["className"]?a("v-layout",{staticClass:"px-3 py-3",attrs:{row:"",wrap:""}},[a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Tên người dùng 💥",box:"",rules:[function(e){return!!e||"Trường dữ liệu bắt buộc"}],required:""},model:{value:e.user["employeeFullName"],callback:function(t){e.$set(e.user,"employeeFullName",t)},expression:"user['employeeFullName']"}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Điện thoại 💥",box:""},model:{value:e.user["employeeTelNo"],callback:function(t){e.$set(e.user,"employeeTelNo",t)},expression:"user['employeeTelNo']"}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-menu",{ref:"menuBirthDate",attrs:{"close-on-content-click":!0,"nudge-right":40,lazy:"",transition:"fade-transition","offset-y":"","full-width":"","max-width":"290px","min-width":"290px"},model:{value:e.menuBirthDate,callback:function(t){e.menuBirthDate=t},expression:"menuBirthDate"}},[a("v-text-field",{attrs:{slot:"activator",box:"","append-icon":"event",label:"Ngày sinh"},on:{blur:function(t){e.ngayCap=e.parseDate(e.user["employeeBirthDate"])}},slot:"activator",model:{value:e.user["employeeBirthDate"],callback:function(t){e.$set(e.user,"employeeBirthDate",t)},expression:"user['employeeBirthDate']"}}),a("v-date-picker",{attrs:{"no-title":""},on:{input:e.changeBirthDate},model:{value:e.ngayCap,callback:function(t){e.ngayCap=t},expression:"ngayCap"}})],1)],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Contact code 💥",box:""},model:{value:e.user["employeeNo"],callback:function(t){e.$set(e.user,"employeeNo",t)},expression:"user['employeeNo']"}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Địa điểm ký số 💥",value:"Hà Nội",box:""}})],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-text-field",{attrs:{label:"Chức danh ký số 💥",box:""},model:{value:e.user["title"],callback:function(t){e.$set(e.user,"title",t)},expression:"user['title']"}})],1),a("v-flex",{attrs:{xs12:"",sm6:""}},[a("p",{staticClass:"mb-2 px-1"},[e._v("File ảnh ký số")]),""!==e.user["classPK"]&&"undefined"!==e.user["classPK"]?a("attached-file-avatar",{attrs:{pk:e.user["classPK"],"pick-item":e.itemEsign,type:"image"}}):e._e()],1),a("v-flex",{attrs:{xs12:"",sm6:""}},[a("p",{staticClass:"mb-2 px-1"},[e._v("File chứng thư gốc")]),""!==e.user["classPK"]&&"undefined"!==e.user["classPK"]?a("attached-file-avatar",{attrs:{pk:e.user["classPK"],"pick-item":e.itemEsignCert,type:"document"}}):e._e()],1),a("v-flex",{staticClass:"text-xs-right",attrs:{sm12:""}},[a("v-btn",{staticClass:"mx-0",attrs:{color:"blue darken-3",loading:e.loading,disabled:e.loading,dark:""},nativeOn:{click:function(t){return e.submitUserProfile(t)}}},[a("v-icon",[e._v("done")]),e._v("  Cập nhật thông tin\n              ")],1)],1)],1):e._e()],1)],1),a("v-flex",{staticClass:"xs12 sm4 px-3"},[a("v-card",{staticStyle:{"border-radius":"4px","-webkit-box-shadow":"0 0 2rem 0 rgba(136,152,170,.15)!important","box-shadow":"0 0 2rem 0 rgba(136,152,170,.15)!important"}},[a("v-card-text",{staticClass:"pt-3",staticStyle:{width:"300px",padding:"0",margin:"0 auto"}},[""!==e.user["classPK"]&&"undefined"!==e.user["classPK"]?a("attached-file-avatar",{attrs:{pk:e.user["classPK"],"pick-item":e.item,type:"image"}}):e._e()],1),"org.opencps.usermgt.model.Employee"===e.user["className"]?a("v-card-text",[a("div",{staticClass:"text-bold text-xs-center mb-2"},[e._v(e._s(e.user["employeeFullName"]))]),a("div",{staticClass:"text-xs-center label__user_profile pb-2"},[a("a",{staticStyle:{"text-decoration":"none","border-bottom":"1px dashed"},attrs:{href:"javascript:;"}},[e._v(e._s(e.user["employeeEmail"]))])]),a("v-layout",{attrs:{row:"",wrap:""}},[a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-subheader",{staticClass:"pr-0"},[e._v("Ngày sinh: ")])],1),a("v-flex",{attrs:{xs8:""}},[a("v-subheader",[e._v(e._s(e.user["employeeBirthDate"]))])],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-subheader",{staticClass:"pr-0"},[e._v("Số điện thoại: ")])],1),a("v-flex",{attrs:{xs8:""}},[a("v-subheader",[e._v(e._s(e.user["employeeTelNo"]))])],1)],1),a("v-layout",{attrs:{row:"",wrap:""}},[a("v-flex",{staticClass:"mx-3",attrs:{xs12:""}},[a("v-btn",{attrs:{block:"",color:"blue darken-3",dark:""},nativeOn:{click:function(t){return e.showChangePass(t)}}},[e._v(e._s(e.stateLabel))])],1)],1)],1):"org.opencps.usermgt.model.Applicant"===e.user["className"]?a("v-card-text",[a("div",{staticClass:"text-bold text-xs-center label__user_profile"},[e._v(e._s(e.user["applicantName"]))]),a("div",{staticClass:"text-xs-center label__user_profile pb-2"},[a("a",{staticStyle:{"text-decoration":"none","border-bottom":"1px dashed"},attrs:{href:"javascript:;"}},[e._v(e._s(e.user["applicantContactEmail"]))])]),a("div",{staticClass:"text-xs-center label__user_profile"},[e._v("\n              "+e._s(e.user["applicantAddress"])+"\n            ")]),a("hr",{staticClass:"my-3",staticStyle:{border:"0","border-top":"1px solid rgba(0,0,0,.1)"}}),"business"===e.user["applicantType"]?a("v-layout",{attrs:{row:"",wrap:""}},[a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-subheader",{staticClass:"pr-0"},[e._v("Mã số thuế: ")])],1),a("v-flex",{attrs:{xs8:""}},[a("v-subheader",[e._v(e._s(e.user["applicantIdNo"]))])],1),a("v-flex",{attrs:{xs12:"",sm4:""}},[a("v-subheader",{staticClass:"pr-0"},[e._v("Ngày cấp: ")])],1),a("v-flex",{attrs:{xs8:""}},[a("v-subheader",[e._v(e._s(e.user["applicantIdDate"]))])],1)],1):e._e(),a("v-layout",{attrs:{row:"",wrap:""}},[a("v-flex",{staticClass:"mx-3",attrs:{xs12:""}},[a("v-btn",{attrs:{block:"",color:"blue darken-3",dark:""},nativeOn:{click:function(t){return e.showChangePass(t)}}},[e._v(e._s(e.stateLabel))])],1)],1)],1):e._e()],1)],1)],1)],1),a("v-snackbar",{attrs:{bottom:!1,left:!1,"multi-line":!1,right:!0,timeout:2e3,top:!0,vertical:!1,color:"red darken-3"},model:{value:e.snackbarerror,callback:function(t){e.snackbarerror=t},expression:"snackbarerror"}},[e._v("\n    Yêu cầu thực hiện thất bại\n    "),a("v-btn",{attrs:{icon:""},on:{click:function(t){e.closeError()}}},[a("v-icon",[e._v("clear")])],1)],1),a("v-snackbar",{attrs:{bottom:!1,left:!1,"multi-line":!1,right:!0,timeout:2e3,top:!0,vertical:!1,color:"success"},model:{value:e.snackbarsuccess,callback:function(t){e.snackbarsuccess=t},expression:"snackbarsuccess"}},[e._v("\n    Yêu cầu thực hiện thành công\n    "),a("v-btn",{attrs:{icon:""},on:{click:function(t){e.snackbarsuccess=!e.snackbarsuccess}}},[a("v-icon",[e._v("clear")])],1)],1)],1)},f=[],h=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v-layout",{attrs:{row:"",wrap:""}},[a("v-flex",{staticClass:"control-section file-preview py-0",attrs:{xs12:""}},[a("div",{staticClass:"control_wrapper"},[a("div",{staticStyle:{height:"250px",overflow:"auto",position:"relative",border:"1px dashed #949494","text-align":"center",padding:"15px","background-size":"cover"},style:"background-image: url("+e.avatarData+");",attrs:{id:"dropArea"}},[a("span",{staticStyle:{position:"absolute",left:"0",top:"0",height:"100%",width:"100%"},attrs:{id:"dropPreview"}},[a("a",{attrs:{href:"javascript:;",id:"browseAvata"}},["image"===e.type?a("i",{staticClass:"v-icon material-icons",staticStyle:{"font-size":"54px",opacity:".2",position:"absolute",top:"0",right:"0"},attrs:{"aria-hidden":"true"}},[e._v("camera_alt")]):a("i",{staticClass:"v-icon material-icons",staticStyle:{"font-size":"54px",opacity:".2",position:"absolute",top:"0",right:"0"},attrs:{"aria-hidden":"true"}},[e._v("insert_drive_file")])])]),a("ejs-uploader",{ref:"uploadObj",attrs:{id:"imagePreview",name:"UploadFiles",allowedExtensions:"image"===e.type?e.extensions:e.extensionsDocument,asyncSettings:e.path,dropArea:e.dropArea,success:e.onSuccess,removing:e.onFileRemove,uploading:e.addHeaders}}),e.noAvatar&&"image"===e.type?a("svg",{staticStyle:{width:"100px",margin:"0 auto","margin-top":"45px","enable-background":"new 0 0 563.43 563.43"},attrs:{version:"1.1",id:"Capa_1",xmlns:"http://www.w3.org/2000/svg","xmlns:xlink":"http://www.w3.org/1999/xlink",x:"0px",y:"0px",viewBox:"0 0 563.43 563.43","xml:space":"preserve"}},[a("path",{attrs:{d:"M280.79,314.559c83.266,0,150.803-67.538,150.803-150.803S364.055,13.415,280.79,13.415S129.987,80.953,129.987,163.756\n            S197.524,314.559,280.79,314.559z M280.79,52.735c61.061,0,111.021,49.959,111.021,111.021S341.851,274.776,280.79,274.776\n            s-111.021-49.959-111.021-111.021S219.728,52.735,280.79,52.735z"}}),a("path",{attrs:{d:"M19.891,550.015h523.648c11.102,0,19.891-8.789,19.891-19.891c0-104.082-84.653-189.198-189.198-189.198H189.198\n            C85.116,340.926,0,425.579,0,530.124C0,541.226,8.789,550.015,19.891,550.015z M189.198,380.708h185.034\n            c75.864,0,138.313,56.436,148.028,129.524H41.17C50.884,437.607,113.334,380.708,189.198,380.708z"}}),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g"),a("g")]):e._e(),e.noAvatar||"document"!==e.type?e._e():a("img",{staticStyle:{width:"100px",margin:"0 auto","margin-top":"45px","enable-background":"new 0 0 563.43 563.43"},attrs:{src:"https://img.icons8.com/color/100/000000/new-resume-template.png"}}),e.noAvatar&&"document"===e.type?a("img",{staticStyle:{width:"100px",margin:"0 auto","margin-top":"45px","enable-background":"new 0 0 563.43 563.43"},attrs:{src:"https://img.icons8.com/ios/100/000000/new-resume-template.png"}}):e._e()],1)])])],1)},g=[],x=a("e0e8");s["default"].use(x["a"]);var b={data:function(){return{noAvatar:!0,avatarData:"",loadingRemove:!1,loading:!1,fileTemplateData:[],fileTemplateTotal:0,path:{saveUrl:"",removeUrl:""},extensions:".jpg, .png",extensionsDocument:".cer",dropArea:"dropArea",rawData:[],className:""}},props:["type","pickItem","pk","code"],created:function(){var e=this;e.$nextTick(function(){this.loadImageComponent()})},mounted:function(){console.log("this.pk",this.pk),this.path={saveUrl:this.pickItem["upload_api"]+"/"+this.pk,removeUrl:this.pickItem["remove_api"]+"/"+this.pk},this.className=this.pickItem["class_name"],document.getElementById("browseAvata").onclick=function(){return document.getElementsByClassName("e-file-select-wrap")[0].querySelector("button").click(),!1}},methods:{addHeaders:function(e){var t=this;e.currentRequest.setRequestHeader("Token",t.getAuthToken()),e.currentRequest.setRequestHeader("groupId",t.getScopeGroupId())},loadImageComponent:function(){var e=this;console.log("vm.pk",e.pk);var t={pk:e.pk,className:e.className};e.noAvatar=!0,e.avatarData="",e.$store.dispatch("getImageComponent",t).then(function(t){if(""!==t&&null!==t){e.noAvatar=!1;var a="";null!==window.themeDisplay&&void 0!==window.themeDisplay&&(a=window.themeDisplay.getPortalURL()),e.avatarData=a+t}})},onSuccess:function(){var e=this;setTimeout(function(){document.getElementById("dropArea").querySelectorAll(".e-upload-success").forEach(function(e){return e.parentNode.removeChild(e)}),e.loadImageComponent()},2e3)},onFileRemove:function(e){e.postRawFile=!1}}},w=b,y=Object(p["a"])(w,h,g,!1,null,null,null);y.options.__file="AttachedFileAvatar.vue";var k=y.exports;function _(e,t){return I(e)||D(e,t)||C()}function C(){throw new TypeError("Invalid attempt to destructure non-iterable instance")}function D(e,t){var a=[],s=!0,r=!1,n=void 0;try{for(var o,i=e[Symbol.iterator]();!(s=(o=i.next()).done);s=!0)if(a.push(o.value),t&&a.length===t)break}catch(e){r=!0,n=e}finally{try{s||null==i["return"]||i["return"]()}finally{if(r)throw n}}return a}function I(e){if(Array.isArray(e))return e}var N={components:{AttachedFileAvatar:k},data:function(){return{changePassWordFail:!1,snackbarsuccess:!1,oldPassWord:"",newPassWord:"",newPassWordConfirm:"",state:0,stateLabel:"Đổi mật khẩu",valid:!1,loading:!1,user:{},menuBirthDate:!1,toDateFormatted:null,ngayCap:null,toggle_exclusive:0,cityItems:[],districtItems:[],wardItems:[],item:{model:"classPK",upload_api:"/o/v1/opencps/users/upload/opencps_applicant/org.opencps.usermgt.model.ApplicantAvatar",remove_api:"",class_name:"org.opencps.usermgt.model.ApplicantAvatar"},itemEsign:{model:"classPK",upload_api:"/o/v1/opencps/users/upload/opencps_applicant/org.opencps.usermgt.model.ApplicantEsign",remove_api:"",class_name:"org.opencps.usermgt.model.ApplicantEsign"},itemEsignCert:{model:"classPK",upload_api:"/o/v1/opencps/users/upload/opencps_applicant/org.opencps.usermgt.model.ApplicantEsignCert",remove_api:"",class_name:"org.opencps.usermgt.model.ApplicantEsignCert"}}},watch:{ngayCap:function(e){this.toDateFormatted=this.formatDate(e),this.user["applicantIdDate"]=this.toDateFormatted}},created:function(){var e=this;e.$nextTick(function(){e.user={},e.$store.dispatch("getUserInfo").then(function(t){e.user=t,"org.opencps.usermgt.model.Employee"===e.user["className"]&&(e.item["upload_api"]="/o/v1/opencps/users/upload/opencps_applicant/org.opencps.usermgt.model.EmployeeAvatar",e.item["class_name"]="rg.opencps.usermgt.model.EmployeeAvatar");var a={collectionCode:"ADMINISTRATIVE_REGION",level:0,parent:0};e.$store.dispatch("loadDictItems",a).then(function(t){e.cityItems=t.data}),""!==e.user["applicantDistrictCode"]&&e.$store.dispatch("loadDictItems",{collectionCode:"ADMINISTRATIVE_REGION",level:1,parent:e.user["applicantCityCode"]}).then(function(t){e.districtItems=t.data}),""!==e.user["applicantWardCode"]&&e.$store.dispatch("loadDictItems",{collectionCode:"ADMINISTRATIVE_REGION",level:1,parent:e.user["applicantDistrictCode"]}).then(function(t){e.wardItems=t.data}),"org.opencps.usermgt.model.Applicant"===e.user["className"]&&(e.user["applicantIdDate"]=e.parseDateInput(e.user["applicantIdDate"])),"org.opencps.usermgt.model.Employee"===e.user["className"]&&(e.user["employeeBirthDate"]=e.parseDateInput(e.user["employeeBirthDate"]))})})},computed:{snackbarerror:{get:function(){return this.$store.getters.getsnackbarerror},set:function(e){this.$store.commit("setsnackbarerror",e)}}},methods:{formatDate:function(e){if(!e)return null;var t=e.split("-"),a=_(t,3),s=a[0],r=a[1],n=a[2];return"".concat(n,"/").concat(r,"/").concat(s)},parseDate:function(e){if(!e)return null;var t=e.split("/"),a=_(t,3),s=a[0],r=a[1],n=a[2];return"".concat(n,"-").concat(r.padStart(2,"0"),"-").concat(s.padStart(2,"0"))},changeBirthDate:function(){var e=this;e.menuBirthDate=!1,e.user["employeeBirthDate"]=e.formatDate(e.ngayCap)},onChangeCity:function(e){var t=this,a={collectionCode:"ADMINISTRATIVE_REGION",level:1,parent:e};t.$store.dispatch("loadDictItems",a).then(function(e){t.districtItems=e.data,t.wardItems=[]})},onChangeDistrict:function(e){var t=this,a={collectionCode:"ADMINISTRATIVE_REGION",level:1,parent:e};t.$store.dispatch("loadDictItems",a).then(function(e){t.wardItems=e.data})},submitUserProfile:function(){var e=this;e.$refs.form.validate()&&(e.loading=!0,e.$store.dispatch("putUser",e.user).then(function(){e.snackbarsuccess=!0,e.loading=!1}).catch(function(){e.loading=!1}))},showChangePass:function(){var e=this;0===e.state?(e.state=1,e.stateLabel="Thông tin tài khoản"):(e.state=0,e.stateLabel="Đổi mật khẩu")},doChangePassWord:function(){var e=this;if(e.$refs.form.validate()){e.loading=!0;var t={oldPassword:e.oldPassWord,newPassword:e.newPassWord};e.changePassWordFail=!1,e.$store.dispatch("changePass",t).then(function(t){e.loading=!1,"false"===String(t)?e.changePassWordFail=!0:e.snackbarsuccess=!0}).catch(function(){e.loading=!1})}},parseDateInput:function(e){if(e){var t=new Date(e);return"".concat(t.getDate().toString().padStart(2,"0"),"/").concat((t.getMonth()+1).toString().padStart(2,"0"),"/").concat(t.getFullYear())}}}},P=N,A=Object(p["a"])(P,v,f,!1,null,null,null);A.options.__file="Home.vue";var T=A.exports,S=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v-container",{attrs:{fluid:""}},[e._v("\n    Not found\n")])},E=[],$={},F=$,W=(a("df8d"),Object(p["a"])(F,S,E,!1,null,"293bd5e2",null));W.options.__file="NotFound.vue";var R=W.exports,O=[{path:"/",name:"Home",component:T,props:!0,meta:{requiresAuth:!0}},{path:"*",name:"NotFound",component:R}];s["default"].use(m["a"]);var B=new m["a"]({routes:O});B.beforeEach(function(e,t,a){e.matched.some(function(e){return e.meta.requiresAuth});a()});var U=B,j=a("2f62"),M=a("bc3a"),K=a.n(M);function q(e,t){return z(e)||G(e,t)||L()}function L(){throw new TypeError("Invalid attempt to destructure non-iterable instance")}function G(e,t){var a=[],s=!0,r=!1,n=void 0;try{for(var o,i=e[Symbol.iterator]();!(s=(o=i.next()).done);s=!0)if(a.push(o.value),t&&a.length===t)break}catch(e){r=!0,n=e}finally{try{s||null==i["return"]||i["return"]()}finally{if(r)throw n}}return a}function z(e){if(Array.isArray(e))return e}s["default"].use(j["a"]);var H=new j["a"].Store({state:{initData:{},snackbarerror:!1,snackbarsocket:!1},actions:{loadInitResource:function(e){var t=e.state;return new Promise(function(e){null!==window.themeDisplay&&void 0!==window.themeDisplay?(t.initData["groupId"]=window.themeDisplay.getScopeGroupId(),t.initData["user"]={userName:window.themeDisplay.getUserName(),userEmail:"",userId:window.themeDisplay.getUserId()}):(t.initData["groupId"]=0,t.initData["user"]={userName:"",userEmail:"",userId:20103}),e(t.initData)})},getUserInfo:function(e){var t=e.commit,a=e.state;return new Promise(function(e,s){H.dispatch("loadInitResource").then(function(){var r={headers:{groupId:a.initData.groupId}},n=0;void 0!==window.themeDisplay&&null!==window.themeDisplay&&(n=window.themeDisplay.getUserId()),K.a.get("/o/v1/opencps/users/"+n,r).then(function(t){var a=t.data;e(a)}).catch(function(e){s(e),t("setsnackbarerror",!0)})})})},loadDictItems:function(e,t){var a=e.commit,s=e.state;return new Promise(function(e,r){H.dispatch("loadInitResource").then(function(){var n={headers:{groupId:s.initData.groupId},params:{parent:t.parent}};K.a.get("/o/rest/v2/dictcollections/"+t.collectionCode+"/dictitems",n).then(function(t){var a=t.data;e(a)},function(e){r(e),a("setsnackbarerror",!0)})})})},changePass:function(e,t){var a=e.commit,s=e.state;return new Promise(function(e,r){var n={headers:{groupId:s.initData.groupId,Accept:"application/json","Content-Type":"application/x-www-form-urlencoded"}},o=0;null!==window.themeDisplay&&void 0!==window.themeDisplay&&(o=window.themeDisplay.getUserId());var i="/o/rest/v2/users/"+o+"/changepass/application",l=new URLSearchParams;l.append("oldPassword",t.oldPassword),l.append("newPassword",t.newPassword),K.a.post(i,l,n).then(function(t){e(t.data)}).catch(function(e){r(e),a("setsnackbarerror",!0)})})},putUser:function(e,t){var a=e.commit,s=e.state;return new Promise(function(e,r){var n={headers:{groupId:s.initData.groupId}},o=new URLSearchParams,i="";if("org.opencps.usermgt.model.Employee"===t["className"]){i="/o/rest/v2/employees/"+t["classPK"],o.append("fullName",t.employeeFullName?t.employeeFullName:""),o.append("telNo",t.employeeTelNo?t.employeeTelNo:""),o.append("employeeNo",t.employeeNo?t.employeeNo:""),o.append("title",t.title?t.title:"");var l="";if(t["employeeBirthDate"]){var c=t["employeeBirthDate"].split("/"),p=q(c,3),u=p[0],d=p[1],m=p[2],v="".concat(m,"-").concat(d.padStart(2,"0"),"-").concat(u.padStart(2,"0"));l=new Date(v).getTime()?new Date(v).getTime():""}o.append("birthdate",l||"")}else"org.opencps.usermgt.model.Applicant"===t["className"]&&(i="/o/rest/v2/applicants/"+t["classPK"],o.append("applicantName",t["applicantName"]),o.append("contactTelNo",t["applicantContactTelNo"]),o.append("address",t["applicantAddress"]),o.append("contactEmail",t["applicantContactTelNo"]),o.append("cityCode",t["applicantCityCode"]),o.append("districtCode",t["applicantDistrictCode"]),o.append("wardCode",t["applicantWardCode"]),o.append("applicantIdNo",t["applicantIdNo"]));K.a.put(i,o,n).then(function(t){e(t)}).catch(function(e){r(e),a("setsnackbarerror",!0)})})},getImageComponent:function(e,t){var a=e.commit,s=e.state;return new Promise(function(e,r){H.dispatch("loadInitResource").then(function(){var n={headers:{groupId:s.initData.groupId}};K.a.get("/o/v1/opencps/users/avatar/"+t["className"]+"/"+t["pk"],n).then(function(t){var a=t.data;e(a)}).catch(function(e){r(e),a("setsnackbarerror",!0)})})})}},mutations:{setsnackbarerror:function(e,t){e.snackbarerror=t}},getters:{}}),V=a("967d");s["default"].use(x["a"]),s["default"].use(V["default"]);var X=void 0!==window.themeDisplay?window.themeDisplay.getScopeGroupId():0;K.a.defaults.headers.common["Token"]=void 0!==window.Liferay?window.Liferay.authToken:"",K.a.defaults.headers.common["groupId"]=X,s["default"].config.productionTip=!0,s["default"].mixin({methods:{getScopeGroupId:function(){return null!==window.themeDisplay&&void 0!==window.themeDisplay?window.themeDisplay.getScopeGroupId():0},getAuthToken:function(){return null!==window.themeDisplay&&void 0!==window.themeDisplay?window.Liferay.authToken:""},getUserId:function(){return null!==window.themeDisplay&&void 0!==window.themeDisplay?window.themeDisplay.getUserId():0}}}),new s["default"]({el:"#app",router:U,store:H,render:function(e){return e(d)}})},"861c":function(e,t,a){},a51b:function(e,t,a){},c35c:function(e,t,a){},ca9a:function(e,t,a){},db70:function(e,t,a){},df8d:function(e,t,a){"use strict";var s=a("db70"),r=a.n(s);r.a}});
//# sourceMappingURL=app.js.map