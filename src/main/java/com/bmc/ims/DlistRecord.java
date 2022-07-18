package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

import java.io.Serializable;

/**
 * Represents a single record on a DELTA list
 */

public class DlistRecord implements Serializable {

	private String action;
	private String elementType;
	private String elementName;
	private String ims_cmd;

	// DB operands
	private String dbnewname;
	private String dbres;
	private String acc;
	private String auto;
	private String rand;
	private String randonly;
	private String rldareas;
	private String iovfext;
	private String dbrelgsam;
	private String dbcopyacb;

	private boolean bmcDbNewname;
	private boolean bmcDbRes;
	private boolean bmcAcc;
	private boolean bmcAuto;
	private boolean bmcRand;
	private boolean bmcRandOnly;
	private boolean bmcRldAreas;
	private boolean bmcDbRelGsam;

	private boolean bmcDbCopyAcb;
	
	
	// APP operands
	private String appnewname;
	private String appres;
	private String ty;
	private String schd;
	private String appfp;
	private String dyn;
	private String gpsb;	
	private String lang;
	private String apptls;
	private String apprelgsam;
	private String appcopyacb;

	private boolean bmcAppNew;
	private boolean bmcAppRes;
	private boolean bmcTy;
	private boolean bmcSchd;
	private boolean bmcAppFp;
	private boolean bmcDyn;
	private boolean bmcGpsb;
	private boolean bmcLang;
	private boolean bmcApptls=false;
	private boolean bmcAppRelGsam;
	private boolean bmcAppCopyAcb;
	
	
	// RTCODE operands
	private String rtcnewname;
	private String rtcinq;
	private String rtcpsbname;
	
	private boolean bmcRtcsNew;
	private boolean bmcRtcInq;
	private boolean bmcRtcsPsbName;
	
	// TRAN operands
	private String psb;
	private String trannewname;
	private String wfi;
	private String npri;
	private String lpri ;
	private String lco ;
	private String mseg;
	private String resp;
	private String cl;
	private String plc;
	private String time;
	private String para;
	private String uschd;
	private String traninq;
	private String recv;
	private String tranfp;
	private String emhs;
	private String mper;
	private String uc;
	private String edit;
	private String lsid;
	private String rsid;
	private String spa;
	private String spad;
	private String segs;
	private String oseg;
	private String msc;
	private String dc;
	private String mreg;
	private String ser;
	private String aoi;
	private String trantls;
	private String exptm;

	private boolean bmcPsb;
	private boolean bmcTranNewName;
	private boolean bmcWfi;
	private boolean bmcNpri;
	private boolean bmcLpri;
	private boolean bmcLco;
	private boolean bmcMseg;
	private boolean bmcResp;
	private boolean bmcCl;
	private boolean bmcPlc;
	private boolean bmcTime;
	private boolean bmcPara;
	private boolean bmcUschd;
	private boolean bmcTranInq;
	private boolean bmcRecv;
	private boolean bmcTranFp;
	private boolean bmcEmhs;
	private boolean bmcMper;
	private boolean bmcUc;
	private boolean bmcEdit;
	private boolean bmcLsid;
	private boolean bmcRsid;
	private boolean bmcSpa;
	private boolean bmcSpad;
	private boolean bmcSegs;
	private boolean bmcOseg;
	private boolean bmcMsc;
	private boolean bmcDc;
	private boolean bmcMreg;
	private boolean bmcSer;
	private boolean bmcAoi;
	private boolean bmcTls;
	private boolean bmcExptm;
	// TERMINAL operands
	private String terminalmask;
	private String terminalnewname;
	private String sign;

	private boolean bmcTermMask;
	private boolean bmcTermNew;
	private boolean bmcSign;
	// LTERM
	private String ltermmask;
	private String ltermnewname;
	private String ass;
	private String msn;
	private String l61;

	private boolean bmcLtermMask;
	private boolean bmcLtermNew;
	private boolean bmcAss;
	private boolean bmcMsn;
	private boolean bmcL61;
	// SUBPOOL
	private String subpoolmask;
	private String subpoolnewname;
	private String msg;

	private boolean bmcSpMask;
	private boolean	bmcSpNewName;
	private boolean bmcMsg;

	/**
	 * Constructor
	 */
	@DataBoundConstructor
	public DlistRecord(String action, String elementType, String elementName, String ims_cmd, String appnewname,
			String appres, String dbnewname, String dbres, String acc, String auto, String rand, String randonly,
			String rldareas, String iovfext, String dbrelgsam, String dbcopyacb,String apprelgsam, String appcopyacb, String ty, String schd, String appfp, String dyn, String gpsb, String lang, 
			String apptls, String rtcnewname, String rtcinq,String rtcpsbname, String psb, String trannewname, String wfi, String npri,
			String lpri, String lco, String mseg, String resp, String cl, String plc, String time, String para,
			String uschd, String traninq, String recv, String tranfp, String emhs, String mper, String uc, String edit,
			String lsid, String rsid, String spa, String spad, String segs, String oseg, String msc, String dc, String mreg,
			String ser, String aoi, String trantls, String exptm, String terminalmask, String terminalnewname,
			String sign, String ltermmask, String ltermnewname, String ass, String msn, String l61, String subpoolmask,
			String subpoolnewname, String msg,
			boolean bmcAppNew,boolean bmcAppRes, boolean bmcDbNewname, boolean bmcDbRes, boolean bmcAcc, boolean bmcAuto, boolean bmcRand, boolean bmcRandOnly,
			boolean bmcRldAreas, boolean bmcIoVfExt, boolean bmcDbCopyAcb, boolean bmcDbRelGsam,boolean bmcAppCopyAcb, boolean bmcAppRelGsam,
			boolean bmcTy, boolean bmcSchd, boolean bmcAppFp, boolean bmcDyn, boolean bmcGpsb, boolean bmcLang,
			boolean bmcApptls, boolean bmcRtcsPsbName, boolean bmcRtcInq, boolean bmcRtcsNew,boolean bmcPsb, boolean bmcTranNewName, boolean bmcWfi, boolean bmcNpri,
			boolean bmcLpri, boolean bmcLco, boolean bmcMseg, boolean bmcResp, boolean bmcCl, boolean bmcPlc, boolean bmcTime, boolean bmcPara,
			boolean bmcUschd, boolean bmcTranInq, boolean bmcRecv, boolean bmcTranFp, boolean bmcEmhs, boolean bmcMper, boolean bmcUc, boolean bmcEdit,
			boolean bmcLsid, boolean bmcRsid, boolean bmcSpa, boolean bmcSpad, boolean bmcSegs, boolean bmcOseg, boolean bmcMsc, boolean bmcDc, boolean bmcMreg,
			boolean bmcSer, boolean bmcAoi, boolean bmcTls, boolean bmcExptm, boolean bmcTermMask, boolean bmcTermNew,
			boolean bmcSign, boolean bmcLtermMask, boolean bmcLtermNew, boolean bmcAss, boolean bmcMsn, boolean bmcL61, boolean bmcSpMask,
			boolean bmcSpNewName, boolean bmcMsg) {
		
		this.elementName = elementName;
		this.elementType = elementType;
		this.action = action;
		this.ims_cmd = ims_cmd;
		
		this.appcopyacb=appcopyacb;
		this.dbcopyacb=dbcopyacb;
		this.apprelgsam=apprelgsam;
		this.dbrelgsam=dbrelgsam;
		this.appnewname = appnewname;
		this.appres = appres;
		this.acc = acc;
		this.auto = auto;
		this.rand = rand;
		this.randonly = randonly;
		this.rldareas = rldareas;
		this.iovfext = iovfext;
		this.dbres = dbres;
		this.dbnewname = dbnewname;
		this.ty = ty;
		this.schd = schd;
		this.appfp = appfp;
		this.dyn = dyn;
		this.gpsb = gpsb;
		this.lang = lang;		
		this.apptls = apptls;
		this.rtcnewname = rtcnewname;
		this.rtcinq = rtcinq;
		this.rtcpsbname=rtcpsbname;
		this.psb = psb;
		this.trannewname = trannewname;
		this.wfi = wfi;
		this.npri = npri;
		this.lpri = lpri;
		this.lco = lco;
		this.mseg = mseg;
		this.resp = resp;
		this.cl = cl;
		this.plc = plc;
		this.time = time;
		this.para = para;
		this.uschd=uschd;
		this.traninq=traninq;  
		this.recv=recv; 
		this.tranfp=tranfp;   
		this.emhs=emhs;		
		this.mper=mper;		
		this.uc=uc;		 
		this.edit=edit;		
		this.lsid=lsid;
		this.rsid=rsid;	 	
		this.spa=spa;			
		this.spad=spad;	
		this.segs=segs;
		this.oseg=oseg;			
		this.msc=msc;	 		
		this.dc=dc;			
		this.mreg=mreg;			
		this.ser=ser;			
		this.aoi=aoi;			
		this.trantls=trantls;			
		this.exptm=exptm;	
		
		this.terminalmask = terminalmask;
		this.terminalnewname = terminalnewname;
		this.sign = sign;

		// LTERM
		this.ltermmask = ltermmask;
		this.ltermnewname = ltermnewname;
		this.ass = ass;
		this.msn = msn;
		this.l61 = l61;

		// SUBPOOL
		this.subpoolmask = subpoolmask;
		this.subpoolnewname = subpoolnewname;
		this.msg = msg;
		
		this.bmcAppCopyAcb=bmcAppCopyAcb;
		this.bmcDbCopyAcb=bmcDbCopyAcb;
		this.bmcAppRelGsam=bmcAppRelGsam;

		
		this.bmcAppNew = bmcAppNew;
		this.bmcAppRes = bmcAppRes;
		this.bmcAcc = bmcAcc;
		this.bmcAuto = bmcAuto;
		this.bmcRand = bmcRand;
		this.bmcRandOnly = bmcRandOnly;
		this.bmcRldAreas = bmcRldAreas;
		this.bmcDbRelGsam = bmcDbRelGsam;
		this.bmcDbRes = bmcDbRes;
		this.bmcDbNewname = bmcDbNewname;
		this.bmcTy = bmcTy;
		this.bmcSchd = bmcSchd;
		this.bmcAppFp = bmcAppFp;
		this.bmcDyn = bmcDyn;
		this.bmcGpsb = bmcGpsb;
		this.bmcLang=bmcLang;
		this.bmcApptls = bmcApptls;
		this.bmcRtcsNew = bmcRtcsNew;
		this.bmcRtcInq = bmcRtcInq;
		this.bmcRtcsPsbName=bmcRtcsPsbName;
		this.bmcPsb = bmcPsb;
		this.bmcTranNewName = bmcTranNewName;
		this.bmcWfi = bmcWfi;
		this.bmcNpri = bmcNpri;
		this.bmcLpri = bmcLpri;
		this.bmcLco = bmcLco;
		this.bmcMseg = bmcMseg;
		this.bmcResp = bmcResp;
		this.bmcCl = bmcCl;
		this.bmcPlc = bmcPlc;
		this.bmcTime = bmcTime;
		this.bmcPara = bmcPara;
		this.bmcUschd=bmcUschd;
		this.bmcTranInq=bmcTranInq;
		this.bmcRecv=bmcRecv;
		this.bmcTranFp=bmcTranFp;
		this.bmcEmhs=bmcEmhs;
		this.bmcMper=bmcMper;
		this.bmcUc=bmcUc;
		this.bmcEdit=bmcEdit;
		this.bmcLsid=bmcLsid;
		this.bmcRsid=bmcRsid;
		this.bmcSpa=bmcSpa;
		this.bmcSpad=bmcSpad;
		this.bmcSegs=bmcSegs;
		this.bmcOseg=bmcOseg;
		this.bmcMsc=bmcMsc;
		this.bmcDc=bmcDc;
		this.bmcMreg=bmcMreg;
		this.bmcSer=bmcSer;
		this.bmcAoi=bmcAoi;
		this.bmcTls=bmcTls;
		this.bmcExptm=bmcExptm;
		
		this.bmcTermMask = bmcTermMask;
		this.bmcTermNew = bmcTermNew;
		this.bmcSign = bmcSign;

		// LTERM
		this.bmcLtermMask = bmcLtermMask;
		this.bmcLtermNew = bmcLtermNew;
		this.bmcAss = bmcAss;
		this.bmcMsn = bmcMsn;
		this.bmcL61 = bmcL61;

		// SUBPOOL
		this.bmcSpMask = bmcSpMask;
		this.bmcSpNewName = bmcSpNewName;
		this.bmcMsg = bmcMsg;

	}

	public String getAction() {
		// System.console().printf("##### getaction %s\n\n", action);
		return action;
	}

	public String getElementType() {
		return this.elementType;
	}

	public String getElementName() {
		// System.console().printf("##### getelementName %s\n\n", elementName);
		return elementName;
	}

	public String getIms_cmd() {
		return ims_cmd;
	}

	
	/* CHNG 3.0.03 */

	public boolean isBmcDbRes() {
		return bmcDbRes;
	}

	public void setBmcDbRes(boolean bmcDbRes) {
		this.bmcDbRes = bmcDbRes;
	}

	public boolean isBmcDbNewname() {
		return bmcDbNewname;
	}

	public void setBmcDbNewname(boolean bmcDbNewname) {
		this.bmcDbNewname = bmcDbNewname;
	}

	public boolean isBmcAcc() {
		return bmcAcc;
	}

	public void setBmcAcc(boolean bmcAcc) {
		this.bmcAcc = bmcAcc;
	}

	public boolean isBmcAuto() {
		return bmcAuto;
	}

	public void setBmcAuto(boolean bmcAuto) {
		this.bmcAuto = bmcAuto;
	}

	public boolean isBmcRand() {
		return bmcRand;
	}

	public void setBmcRand(boolean bmcRand) {
		this.bmcRand = bmcRand;
	}

	public boolean isBmcRandOnly() {
		return bmcRandOnly;
	}

	public void setBmcRandOnly(boolean bmcRandOnly) {
		this.bmcRandOnly = bmcRandOnly;
	}

	public boolean isBmcRldAreas() {
		return bmcRldAreas;
	}

	public void setBmcRldAreas(boolean bmcRldAreas) {
		this.bmcRldAreas = bmcRldAreas;
	}

	public boolean isBmcDbRelGsam() {
		return bmcDbRelGsam;
	}

	public void setBmcDbRelGsam(boolean bmcDbRelGsam) {
		this.bmcDbRelGsam = bmcDbRelGsam;
	}

	public boolean isBmcDbCopyAcb() {
		return bmcDbCopyAcb;
	}

	public void setBmcDbCopyAcb(boolean bmcDbCopyAcb) {
		this.bmcDbCopyAcb = bmcDbCopyAcb;
	}

	public boolean isBmcAoi() {
		return bmcAoi;
	}

	public boolean isBmcAppCopyAcb() {
		return bmcAppCopyAcb;
	}

	public boolean isBmcAppFp() {
		return bmcAppFp;
	}

	public boolean isBmcAppNew() {
		return bmcAppNew;
	}

	public boolean isBmcAppRelGsam() {
		return bmcAppRelGsam;
	}

	public boolean isBmcAppRes() {
		return bmcAppRes;
	}

	public boolean isBmcApptls() {
		return bmcApptls;
	}

	public boolean isBmcAss() {
		return bmcAss;
	}

	public boolean isBmcCl() {
		return bmcCl;
	}

	public boolean isBmcDc() {
		return bmcDc;
	}

	public boolean isBmcDyn() {
		return bmcDyn;
	}

	public boolean isBmcEdit() {
		return bmcEdit;
	}

	public boolean isBmcEmhs() {
		return bmcEmhs;
	}

	public boolean isBmcExptm() {
		return bmcExptm;
	}

	public boolean isBmcGpsb() {
		return bmcGpsb;
	}

	public boolean isBmcL61() {
		return bmcL61;
	}

	public boolean isBmcLang() {
		return bmcLang;
	}

	public boolean isBmcLco() {
		return bmcLco;
	}

	public boolean isBmcLpri() {
		return bmcLpri;
	}

	public boolean isBmcLsid() {
		return bmcLsid;
	}

	public boolean isBmcLtermMask() {
		return bmcLtermMask;
	}

	public boolean isBmcLtermNew() {
		return bmcLtermNew;
	}

	public boolean isBmcMper() {
		return bmcMper;
	}

	public boolean isBmcMreg() {
		return bmcMreg;
	}

	public boolean isBmcMsc() {
		return bmcMsc;
	}

	public boolean isBmcMseg() {
		return bmcMseg;
	}

	public boolean isBmcMsg() {
		return bmcMsg;
	}

	public boolean isBmcMsn() {
		return bmcMsn;
	}

	public boolean isBmcNpri() {
		return bmcNpri;
	}

	public boolean isBmcOseg() {
		return bmcOseg;
	}

	public boolean isBmcPara() {
		return bmcPara;
	}

	public boolean isBmcPlc() {
		return bmcPlc;
	}

	public boolean isBmcPsb() {
		return bmcPsb;
	}

	public boolean isBmcRecv() {
		return bmcRecv;
	}

	public boolean isBmcResp() {
		return bmcResp;
	}

	public boolean isBmcRsid() {
		return bmcRsid;
	}

	public boolean isBmcRtcInq() {
		return bmcRtcInq;
	}

	public boolean isBmcRtcsNew() {
		return bmcRtcsNew;
	}

	public boolean isBmcRtcsPsbName() {
		return bmcRtcsPsbName;
	}

	public boolean isBmcSchd() {
		return bmcSchd;
	}

	public boolean isBmcSegs() {
		return bmcSegs;
	}

	public boolean isBmcSer() {
		return bmcSer;
	}

	public boolean isBmcSign() {
		return bmcSign;
	}

	public boolean isBmcSpa() {
		return bmcSpa;
	}

	public boolean isBmcSpad() {
		return bmcSpad;
	}

	public boolean isBmcSpMask() {
		return bmcSpMask;
	}

	public boolean isBmcSpNewName() {
		return bmcSpNewName;
	}

	public boolean isBmcTermMask() {
		return bmcTermMask;
	}

	public boolean isBmcTermNew() {
		return bmcTermNew;
	}

	public boolean isBmcTime() {
		return bmcTime;
	}

	public boolean isBmcTls() {
		return bmcTls;
	}

	public boolean isBmcTranFp() {
		return bmcTranFp;
	}

	public boolean isBmcTranInq() {
		return bmcTranInq;
	}

	public boolean isBmcTranNewName() {
		return bmcTranNewName;
	}

	public boolean isBmcTy() {
		return bmcTy;
	}

	public boolean isBmcUc() {
		return bmcUc;
	}

	public boolean isBmcUschd() {
		return bmcUschd;
	}

	public boolean isBmcWfi() {
		return bmcWfi;
	}

	public void setBmcAoi(boolean bmcAoi) {
		this.bmcAoi = bmcAoi;
	}

	public void setBmcAppCopyAcb(boolean bmcAppCopyAcb) {
		this.bmcAppCopyAcb = bmcAppCopyAcb;
	}

	public void setBmcAppFp(boolean bmcAppFp) {
		this.bmcAppFp = bmcAppFp;
	}

	public void setBmcAppNew(boolean bmcAppNew) {
		this.bmcAppNew = bmcAppNew;
	}

	public void setBmcAppRelGsam(boolean bmcAppRelGsam) {
		this.bmcAppRelGsam = bmcAppRelGsam;
	}

	public void setBmcAppRes(boolean bmcAppRes) {
		this.bmcAppRes = bmcAppRes;
	}

	public void setBmcApptls(boolean bmcApptls) {
		this.bmcApptls = bmcApptls;
	}

	public void setBmcAss(boolean bmcAss) {
		this.bmcAss = bmcAss;
	}

	public void setBmcCl(boolean bmcCl) {
		this.bmcCl = bmcCl;
	}

	public void setBmcDc(boolean bmcDc) {
		this.bmcDc = bmcDc;
	}

	public void setBmcDyn(boolean bmcDyn) {
		this.bmcDyn = bmcDyn;
	}

	public void setBmcEdit(boolean bmcEdit) {
		this.bmcEdit = bmcEdit;
	}

	public void setBmcEmhs(boolean bmcEmhs) {
		this.bmcEmhs = bmcEmhs;
	}

	public void setBmcExptm(boolean bmcExptm) {
		this.bmcExptm = bmcExptm;
	}

	public void setBmcGpsb(boolean bmcGpsb) {
		this.bmcGpsb = bmcGpsb;
	}

	public void setBmcL61(boolean bmcL61) {
		this.bmcL61 = bmcL61;
	}

	public void setBmcLang(boolean bmcLang) {
		this.bmcLang = bmcLang;
	}

	public void setBmcLco(boolean bmcLco) {
		this.bmcLco = bmcLco;
	}

	public void setBmcLpri(boolean bmcLpri) {
		this.bmcLpri = bmcLpri;
	}

	public void setBmcLsid(boolean bmcLsid) {
		this.bmcLsid = bmcLsid;
	}

	public void setBmcLtermMask(boolean bmcLtermMask) {
		this.bmcLtermMask = bmcLtermMask;
	}

	public void setBmcLtermNew(boolean bmcLtermNew) {
		this.bmcLtermNew = bmcLtermNew;
	}

	public void setBmcMper(boolean bmcMper) {
		this.bmcMper = bmcMper;
	}

	public void setBmcMreg(boolean bmcMreg) {
		this.bmcMreg = bmcMreg;
	}

	public void setBmcMsc(boolean bmcMsc) {
		this.bmcMsc = bmcMsc;
	}

	public void setBmcMseg(boolean bmcMseg) {
		this.bmcMseg = bmcMseg;
	}

	public void setBmcMsg(boolean bmcMsg) {
		this.bmcMsg = bmcMsg;
	}

	public void setBmcMsn(boolean bmcMsn) {
		this.bmcMsn = bmcMsn;
	}

	public void setBmcNpri(boolean bmcNpri) {
		this.bmcNpri = bmcNpri;
	}

	public void setBmcOseg(boolean bmcOseg) {
		this.bmcOseg = bmcOseg;
	}

	public void setBmcPara(boolean bmcPara) {
		this.bmcPara = bmcPara;
	}

	public void setBmcPlc(boolean bmcPlc) {
		this.bmcPlc = bmcPlc;
	}

	public void setBmcPsb(boolean bmcPsb) {
		this.bmcPsb = bmcPsb;
	}

	public void setBmcRecv(boolean bmcRecv) {
		this.bmcRecv = bmcRecv;
	}

	public void setBmcResp(boolean bmcResp) {
		this.bmcResp = bmcResp;
	}

	public void setBmcRsid(boolean bmcRsid) {
		this.bmcRsid = bmcRsid;
	}

	public void setBmcRtcInq(boolean bmcRtcInq) {
		this.bmcRtcInq = bmcRtcInq;
	}

	public void setBmcRtcsNew(boolean bmcRtcsNew) {
		this.bmcRtcsNew = bmcRtcsNew;
	}

	public void setBmcRtcsPsbName(boolean bmcRtcsPsbName) {
		this.bmcRtcsPsbName = bmcRtcsPsbName;
	}

	public void setBmcSchd(boolean bmcSchd) {
		this.bmcSchd = bmcSchd;
	}

	public void setBmcSegs(boolean bmcSegs) {
		this.bmcSegs = bmcSegs;
	}

	public void setBmcSer(boolean bmcSer) {
		this.bmcSer = bmcSer;
	}

	public void setBmcSign(boolean bmcSign) {
		this.bmcSign = bmcSign;
	}

	public void setBmcSpa(boolean bmcSpa) {
		this.bmcSpa = bmcSpa;
	}

	public void setBmcSpad(boolean bmcSpad) {
		this.bmcSpad = bmcSpad;
	}

	public void setBmcSpMask(boolean bmcSpMask) {
		this.bmcSpMask = bmcSpMask;
	}

	public void setBmcSpNewName(boolean bmcSpNewName) {
		this.bmcSpNewName = bmcSpNewName;
	}

	public void setBmcTermMask(boolean bmcTermMask) {
		this.bmcTermMask = bmcTermMask;
	}

	public void setBmcTermNew(boolean bmcTermNew) {
		this.bmcTermNew = bmcTermNew;
	}

	public void setBmcTime(boolean bmcTime) {
		this.bmcTime = bmcTime;
	}

	public void setBmcTls(boolean bmcTls) {
		this.bmcTls = bmcTls;
	}

	public void setBmcTranFp(boolean bmcTranFp) {
		this.bmcTranFp = bmcTranFp;
	}

	public void setBmcTranInq(boolean bmcTranInq) {
		this.bmcTranInq = bmcTranInq;
	}

	public void setBmcTranNewName(boolean bmcTranNewName) {
		this.bmcTranNewName = bmcTranNewName;
	}

	public void setBmcTy(boolean bmcTy) {
		this.bmcTy = bmcTy;
	}

	public void setBmcUc(boolean bmcUc) {
		this.bmcUc = bmcUc;
	}

	public void setBmcUschd(boolean bmcUschd) {
		this.bmcUschd = bmcUschd;
	}

	public void setBmcWfi(boolean bmcWfi) {
		this.bmcWfi = bmcWfi;
	}

	public String getAppcopyacb() {
		return appcopyacb;
	}


	public String getApprelgsam() {
		return apprelgsam;
	}
	
	public String getDbcopyacb() {
		return dbcopyacb;
	}
	
	public String getDbrelgsam() {
		return dbrelgsam;
	}
		
	public void setAppcopyacb(String appcopyacb) {
		this.appcopyacb = appcopyacb;
	}
	
	public void setApprelgsam(String apprelgsam) {
		this.apprelgsam = apprelgsam;
	}
	
	public void setDbcopyacb(String dbcopyacb) {
		this.dbcopyacb = dbcopyacb;
	}
	
	public void setDbrelgsam(String dbrelgsam) {
		this.dbrelgsam = dbrelgsam;
	}
	

	


	

	
	

	
	/* END OF CHNG 3.0.03 */
	public String getAcc() {
		return acc;
	}
	
	public void setAcc(String acc) {
		this.acc = acc;
	}
	
	public void setAuto(String auto) {
		this.auto = auto;
	}

	public String getAuto() {
		return auto;
	}

	public String getDyn() {
		return dyn;
	}

	public void setDyn(String dyn) {
		this.dyn = dyn;
	}
	
	public void setGpsb(String gpsb) {
		this.gpsb = gpsb;
	}
	
	public void setIovfext(String iovfext) {
		this.iovfext = iovfext;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void setRldareas(String rldareas) {
		this.rldareas = rldareas;
	}
	
	public void setSchd(String schd) {
		this.schd = schd;
	}
	
	public void setTy(String ty) {
		this.ty = ty;
	}
	
	public String getAppfp() {
		return appfp;
	}

	public void setAppfp(String appfp) {
		this.appfp = appfp;
	}

	public String getGpsb() {
		return gpsb;
	}

	public String getIovfext() {
		return iovfext;
	}

	public String getLang() {
		return lang;
	}



	
	public String getRand() {
		return rand;
	}
	
	public void setRand(String rand) {
		this.rand = rand;
	}

	public String getRandonly() {
		return randonly;
	}
	
	public void setRandonly(String randonly) {
		this.randonly = randonly;
	}

	public String getRldareas() {
		return rldareas;
	}

	public String getSchd() {
		return schd;
	}

	public String getApptls() {
		return apptls;
	}

	public void setApptls(String apptls) {
		this.apptls = apptls;
	}

	public String getTy() {
		return ty;
	}

	public String getRtcnewname() {
		return rtcnewname;
	}

	public void setRtcnewname(String rtcnewname) {
		this.rtcnewname = rtcnewname;
	}

	public String getRtcpsbname() {
		return rtcpsbname;
	}
	public void setRtcpsbname(String rtcpsbname) {
		this.rtcpsbname = rtcpsbname;
	}
	public String getAppnewname() {
		return appnewname;
	}

	public void setAppnewname(String appnewname) {
		this.appnewname = appnewname;
	}

	public String getDbnewname() {
		return dbnewname;
	}

	public void setDbnewname(String dbnewname) {
		this.dbnewname = dbnewname;
	}

	public String getAppres() {
		return appres;
	}

	public void setAppres(String appres) {
		this.appres = appres;
	}

	public String getDbres() {
		return dbres;
	}

	public void setDbres(String dbres) {
		this.dbres = dbres;
	}

	public String getRtcinq() {
		return rtcinq;
	}

	public void setRtcinq(String rtcinq) {
		this.rtcinq = rtcinq;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public void setIms_cmd(String ims_cmd) {
		this.ims_cmd = ims_cmd;
	}

	public String getPsb() {
		return psb;
	}

	public void setPsb(String psb) {
		this.psb = psb;
	}

	public String getTrannewname() {
		return trannewname;
	}

	public void setTrannewname(String trannewname) {
		this.trannewname = trannewname;
	}

	public String getWfi() {
		return wfi;
	}

	public void setWfi(String wfi) {
		this.wfi = wfi;
	}

	public String getNpri() {
		return npri;
	}

	public void setNpri(String npri) {
		this.npri = npri;
	}

	public String getLpri() {
		return lpri;
	}

	public void setLpri(String lpri) {
		this.lpri = lpri;
	}

	public String getLco() {
		return lco;
	}

	public void setLco(String lco) {
		this.lco = lco;
	}

	public String getMseg() {
		return mseg;
	}

	public void setMseg(String mseg) {
		this.mseg = mseg;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public String getCl() {
		return cl;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

	public String getPlc() {
		return plc;
	}

	public void setPlc(String plc) {
		this.plc = plc;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getUschd() {
		return uschd;
	}
	public void setUschd(String uschd) {
		this.uschd = uschd;
	}
	public String getTraninq() {
		return traninq;
	}
	public void setTraninq(String traninq) {
		this.traninq = traninq;
	}
	public String getRecv() {
		return recv;
	}
	public void setRecv(String recv) {
		this.recv = recv;
	}
	public String getTranfp() {
		return tranfp;
	}
	public void setTranfp(String tranfp) {
		this.tranfp = tranfp;
	}
	public String getEmhs() {
		return emhs;
	}
	public void setEmhs(String emhs) {
		this.emhs = emhs;
	}
	public String getMper() {
		return mper;
	}
	public void setMper(String mper) {
		this.mper = mper;
	}
	public String getUc() {
		return uc;
	}
	public void setUc(String uc) {
		this.uc = uc;
	}
	public String getEdit() {
		return edit;
	}
	public void setEdit(String edit) {
		this.edit = edit;
	}
	public String getLsid() {
		return lsid;
	}
	public void setLsid(String lsid) {
		this.lsid = lsid;
	}
	public String getRsid() {
		return rsid;
	}
	public void setRsid(String rsid) {
		this.rsid = rsid;
	}
	public String getSpa() {
		return spa;
	}
	public void setSpa(String spa) {
		this.spa = spa;
	}
	public String getSpad() {
		return spad;
	}
	public void setSpad(String spad) {
		this.spad = spad;
	}
	public String getSegs() {
		return segs;
	}
	public void setSegs(String segs) {
		this.segs = segs;
	}
	public String getOseg() {
		return oseg;
	}
	public void setOseg(String oseg) {
		this.oseg = oseg;
	}
	public String getMsc() {
		return msc;
	}
	public void setMsc(String msc) {
		this.msc = msc;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public String getMreg() {
		return mreg;
	}
	public void setMreg(String mreg) {
		this.mreg = mreg;
	}
	public String getSer() {
		return ser;
	}
	public void setSer(String ser) {
		this.ser = ser;
	}
	public String getAoi() {
		return aoi;
	}
	public void setAoi(String aoi) {
		this.aoi = aoi;
	}
	public String getTrantls() {
		return trantls;
	}
	public void setTrantls(String trantls) {
		this.trantls = trantls;
	}
	public String getExptm() {
		return exptm;
	}
	public void setExptm(String exptm) {
		this.exptm = exptm;
	}
	
	public String getTerminalmask() {
		return terminalmask;
	}

	public void setTerminalmask(String terminalmask) {
		this.terminalmask = terminalmask;
	}

	public String getTerminalnewname() {
		return terminalnewname;
	}

	public void setTerminalnewname(String terminalnewname) {
		this.terminalnewname = terminalnewname;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getLtermmask() {
		return ltermmask;
	}

	public void setLtermmask(String ltermmask) {
		this.ltermmask = ltermmask;
	}

	public String getLtermnewname() {
		return ltermnewname;
	}

	public void setLtermnewname(String ltermnewname) {
		this.ltermnewname = ltermnewname;
	}

	public String getAss() {
		return ass;
	}

	public void setAss(String ass) {
		this.ass = ass;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getL61() {
		return l61;
	}

	public void setL61(String l61) {
		this.l61 = l61;
	}

	public String getSubpoolmask() {
		return subpoolmask;
	}

	public void setSubpoolmask(String subpoolmask) {
		this.subpoolmask = subpoolmask;
	}

	public String getSubpoolnewname() {
		return subpoolnewname;
	}

	public void setSubpoolnewname(String subpoolnewname) {
		this.subpoolnewname = subpoolnewname;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	


}