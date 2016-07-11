package com.framework.demo.dto.jqgrid;
    /**
    Represents a jqGrid row in the data send back as a response to jqGrid AJAX data request.
    */
    public class JqGridRow
    {
    	/**
        The unique ID of the jqGrid row represented by this instance of <code>JSONGridRow</code>
        */
        public String id;

        /**
        An array of objects representing the cell values of the jqGrid row represented by this instance of <code>JSONGridRow</code>.
        The number of elements in this array should equal the number of columns defined in jqGrid colModel.
        */
        public Object[] cell;

        /**
         Initializes a new instance of <code>JSONGridRow</code>.
         @param ID The unique ID of the jqGrid row represented by this instance of <code>JSONGridRow</code>
         @param cells An array of objects representing the cell values of the jqGrid row represented by this instance of <code>JSONGridRow</code>. The number of elements in this array should equal the number of columns defined in jqGrid colModel.           
         */
        public JqGridRow(String ID, Object[] cells)
        {
            id = ID;
            cell = cells;
        }
    }

