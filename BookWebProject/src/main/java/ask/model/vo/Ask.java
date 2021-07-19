package ask.model.vo;

import java.sql.Date;

public class Ask implements java.io.Serializable {
	private static final long serialVersionUID = 116L;
	
	private int AskNum;
	private String AskWriterId;
	private String AskGroup;
	private String AskTitle;
	private String AskContent;
	private String AskState;
	private String AskOriginalFile;
	private String AskRenameFile;
	private String answerContent;
	private java.sql.Date writeDate;
	private java.sql.Date answerDate;
	
	public Ask() {}

	public Ask(int AskNum, String AskWriterId, String AskGroup, String AskTitle, String AskContent, String AskState,
			Date writeDate) {
		super();
		this.AskNum = AskNum;
		this.AskWriterId = AskWriterId;
		this.AskGroup = AskGroup;
		this.AskTitle = AskTitle;
		this.AskContent = AskContent;
		this.AskState = AskState;
		this.writeDate = writeDate;
	}

	public Ask(int AskNum, String AskWriterId, String AskGroup, String AskTitle, String AskContent, String AskState,
			String AskOriginalFile, String AskRenameFile, String answerContent, Date writeDate, Date answerDate) {
		super();
		this.AskNum = AskNum;
		this.AskWriterId = AskWriterId;
		this.AskGroup = AskGroup;
		this.AskTitle = AskTitle;
		this.AskContent = AskContent;
		this.AskState = AskState;
		this.AskOriginalFile = AskOriginalFile;
		this.AskRenameFile = AskRenameFile;
		this.answerContent = answerContent;
		this.writeDate = writeDate;
		this.answerDate = answerDate;
	}
	
}
