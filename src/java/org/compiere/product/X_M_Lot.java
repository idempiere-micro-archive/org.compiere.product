/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.idempiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.product;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.I_M_Lot;
import org.compiere.orm.MTable;
import org.compiere.orm.PO;
import org.idempiere.orm.I_Persistent;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.orm.POInfo;


/** Generated Model for M_Lot
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_M_Lot extends PO implements I_M_Lot, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20171031L;

    /** Standard Constructor */
    public X_M_Lot (Properties ctx, int M_Lot_ID, String trxName)
    {
      super (ctx, M_Lot_ID, trxName);
      /** if (M_Lot_ID == 0)
        {
			setM_Lot_ID (0);
			setM_Product_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_M_Lot (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_M_Lot[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Date From.
		@param DateFrom 
		Starting date for a range
	  */
	public void setDateFrom (Timestamp DateFrom)
	{
		set_Value (COLUMNNAME_DateFrom, DateFrom);
	}

	/** Get Date From.
		@return Starting date for a range
	  */
	public Timestamp getDateFrom () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFrom);
	}

	/** Set Date To.
		@param DateTo 
		End date of a date range
	  */
	public void setDateTo (Timestamp DateTo)
	{
		set_Value (COLUMNNAME_DateTo, DateTo);
	}

	/** Get Date To.
		@return End date of a date range
	  */
	public Timestamp getDateTo () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTo);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	public org.compiere.model.I_M_LotCtl getM_LotCtl() throws RuntimeException
    {
		return (org.compiere.model.I_M_LotCtl)MTable.get(getCtx(), org.compiere.model.I_M_LotCtl.Table_Name)
			.getPO(getM_LotCtl_ID(), get_TrxName());	}

	/** Set Lot Control.
		@param M_LotCtl_ID 
		Product Lot Control
	  */
	public void setM_LotCtl_ID (int M_LotCtl_ID)
	{
		if (M_LotCtl_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_LotCtl_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_LotCtl_ID, Integer.valueOf(M_LotCtl_ID));
	}

	/** Get Lot Control.
		@return Product Lot Control
	  */
	public int getM_LotCtl_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_LotCtl_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Lot.
		@param M_Lot_ID 
		Product Lot Definition
	  */
	public void setM_Lot_ID (int M_Lot_ID)
	{
		if (M_Lot_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_Lot_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_Lot_ID, Integer.valueOf(M_Lot_ID));
	}

	/** Get Lot.
		@return Product Lot Definition
	  */
	public int getM_Lot_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Lot_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_Lot_UU.
		@param M_Lot_UU M_Lot_UU	  */
	public void setM_Lot_UU (String M_Lot_UU)
	{
		set_Value (COLUMNNAME_M_Lot_UU, M_Lot_UU);
	}

	/** Get M_Lot_UU.
		@return M_Lot_UU	  */
	public String getM_Lot_UU () 
	{
		return (String)get_Value(COLUMNNAME_M_Lot_UU);
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getM_Product_ID()));
    }

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}
}