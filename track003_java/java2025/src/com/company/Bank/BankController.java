package com.company.Bank;

import java.util.ArrayList;
import java.util.List;

public interface BankController {
	int exec(List<UserInfo> users, int find);
	UserInfo exec(List<UserInfo> users);
}
