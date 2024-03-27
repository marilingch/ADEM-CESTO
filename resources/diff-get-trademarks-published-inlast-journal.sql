select f.file_seq, f.file_typ, f.file_ser, f.file_nbr, s.status_name, p.status_code, p.status_date, f.proc_nbr
from ip_action a, IP_JOURNAL j, ip_proc p, CF_STATUS s, IP_FILE f
where 
    a.JOURNAL_CODE = j.JOURNAL_CODE and
    j.PUBLICATION_DATE >= GETDATE()-3 and
    a.proc_nbr = f.proc_nbr and 
    a.proc_typ = f.proc_typ and
    f.file_typ NOT IN ('A') and
	f.APPL_SUBTYP NOT IN ('5') AND	
    s.STATUS_CODE = p.STATUS_CODE and
    s.proc_typ = p.proc_typ and 
    f.file_seq = p.file_seq and
    f.file_typ = p.file_typ and
    f.file_ser = p.file_ser and
    f.file_nbr = p.file_nbr and
    s.status_code in ('036','037','045','016','204','185','024','028','029','030','032','033','094','128','129','149','181','185','182','083','201','014','015','075','084','077','085','147','017','018','019','020','021','215','076','202','035','097','098','200','179','095','038','195','043','209','210','211','039','040','041','179','044')  
    and  (f.publication_date is not null OR f.registration_date is not null OR f.registration_nbr > 0)
order by f.FILE_SER, f.FILE_NBR