package com.ecnu.ob.model;

public enum RsAdminCmd {

		NULL,
		//��ʼ��ϵͳ��(ֻ��ϵͳ��ʼ������ʱ��ִ��)
		BOOT_STARP,
		
		//����rs��ɫ(��rs����ʱִ��)
		SET_OBI_ROLE_MASTER,
		
		//�л���ups
		SET_OBI_ROLE_SLAVE,
		
		//�л���ups
		CHANGE_UPS_MASTER,
		
		//ˢ��schema��Ϣ
		REFRESH_SCHEMA,
		
		//���rootserver��root table��Ϣ��ǿ��cs���»㱨root table��Ϣ
		CLEAN_ROOT_TABLE,
		
		//С�汾����
		//MINOR_FREEZE,
		
		//��汾����
		//MAJOR_FREEZE,
		
		//cs�ϴ�����tablet(�ϲ�ʱ������cs��ȱ����Ӧ��tablet�����ºϲ��������ʱ��������һ��cs��ִ����������֮�����»㱨)
		//CREATE_TABLET,
		
		
		//---------dumpϵͳ��Ϣ��ִ�гɹ���ͨ���鿴rootserver.log�鿴��Ϣ----------------
		
		//dump root table ��Ϣ
		DUMP_ROOT_TABLE,
		
		//dump server ��Ϣ
		DUMP_SERVER,
		
		//dump �쳣��root table ��Ϣ
		DUMP_UNUSUAL_TABLETS,
		
		
		//----------�鿴��Ϣ--------------------------------
		
		//�鿴����server
		ALL_SERVER,
		
		//�鿴�ϲ�״̬
		MERGE,
		
		//�鿴�ϲ��汾
		FROZEN_VERSION,
		
}
