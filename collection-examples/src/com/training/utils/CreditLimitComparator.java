package com.training.utils;
import com.training.model.*;

import java.util.Comparator;

public class CreditLimitComparator implements Comparator<CreditCard> {

	@Override
	public int compare(CreditCard obj1, CreditCard obj2) {
		if(obj1.getCreditLimit()>(obj2.getCreditLimit())) return 1;
		if(obj1.getCreditLimit()>(obj2.getCreditLimit())) return -1;
		return 0;
	}

}
