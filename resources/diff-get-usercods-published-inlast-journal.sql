select p.file_seq, p.file_typ, p.file_ser, p.file_nbr, s.status_name, p.status_code, p.status_date, f.proc_nbr
from ip_action a, IP_JOURNAL j, cf_action_type act, ip_userdoc_procs uproc, ip_proc p, CF_USERDOC_TYPE cudt, CF_STATUS s, IP_FILE f
where 
    a.action_typ = act.action_typ and
    a.JOURNAL_CODE = j.JOURNAL_CODE and
    j.PUBLICATION_DATE >= GETDATE()-3 and
    a.proc_nbr = uproc.proc_nbr and 
    a.proc_typ = uproc.proc_typ and
    uproc.userdoc_file_typ NOT IN ('A') and 
    uproc.userdoc_file_seq = p.file_seq and
    uproc.userdoc_file_typ = p.file_typ and
    uproc.userdoc_file_ser = p.file_ser and
    uproc.userdoc_file_nbr = p.file_nbr and
    uproc.USERDOC_TYP = cudt.USERDOC_TYP and 
    s.STATUS_CODE = p.STATUS_CODE and
    s.proc_typ = p.proc_typ and 
	f.file_typ NOT IN ('A') and
	f.APPL_SUBTYP NOT IN ('5') AND	
    f.file_seq = p.file_seq and
    f.file_typ = p.file_typ and
    f.file_ser = p.file_ser and
    f.file_nbr = p.file_nbr and
    s.status_code in ('036','037','045','016','204','185','024','028','029','030','032','033','094','128','129','149','181','185','182','083','201','014','015','075','084','077','085','147','017','018','019','020','021','215','076','202','035','097','098','200','179','095','038','195','043','209','210','211','039','040','041','179','044')  
    and  (j.publication_date is not null OR f.registration_date is not null OR f.registration_nbr > 0)
order by f.FILE_SER, f.file_nbr