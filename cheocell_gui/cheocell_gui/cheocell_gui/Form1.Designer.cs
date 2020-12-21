namespace cheocell_gui
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.nhapCell = new System.Windows.Forms.Button();
            this.nhapScan = new System.Windows.Forms.Button();
            this.linkCell = new System.Windows.Forms.TextBox();
            this.linkScan = new System.Windows.Forms.TextBox();
            this.timCheoCell = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.bW = new System.Windows.Forms.TextBox();
            this.KhoangCach = new System.Windows.Forms.TextBox();
            this.diemPhucVu = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.linkResult = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // nhapCell
            // 
            this.nhapCell.Location = new System.Drawing.Point(1210, 12);
            this.nhapCell.Name = "nhapCell";
            this.nhapCell.Size = new System.Drawing.Size(85, 23);
            this.nhapCell.TabIndex = 0;
            this.nhapCell.Text = "nhapCell";
            this.nhapCell.UseVisualStyleBackColor = true;
            this.nhapCell.Click += new System.EventHandler(this.nhapCell_Click);
            // 
            // nhapScan
            // 
            this.nhapScan.Location = new System.Drawing.Point(1210, 51);
            this.nhapScan.Name = "nhapScan";
            this.nhapScan.Size = new System.Drawing.Size(85, 23);
            this.nhapScan.TabIndex = 1;
            this.nhapScan.Text = "nhapScan";
            this.nhapScan.UseVisualStyleBackColor = true;
            this.nhapScan.Click += new System.EventHandler(this.nhapScan_Click);
            // 
            // linkCell
            // 
            this.linkCell.Location = new System.Drawing.Point(13, 13);
            this.linkCell.Name = "linkCell";
            this.linkCell.Size = new System.Drawing.Size(1174, 22);
            this.linkCell.TabIndex = 2;
            this.linkCell.TextChanged += new System.EventHandler(this.linkCell_TextChanged);
            // 
            // linkScan
            // 
            this.linkScan.Location = new System.Drawing.Point(13, 51);
            this.linkScan.Name = "linkScan";
            this.linkScan.Size = new System.Drawing.Size(1174, 22);
            this.linkScan.TabIndex = 3;
            this.linkScan.TextChanged += new System.EventHandler(this.linkScan_TextChanged);
            // 
            // timCheoCell
            // 
            this.timCheoCell.Location = new System.Drawing.Point(1329, 12);
            this.timCheoCell.Name = "timCheoCell";
            this.timCheoCell.Size = new System.Drawing.Size(102, 99);
            this.timCheoCell.TabIndex = 4;
            this.timCheoCell.Text = "timCheoCell";
            this.timCheoCell.UseVisualStyleBackColor = true;
            this.timCheoCell.Click += new System.EventHandler(this.timCheoCell_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(12, 175);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 24;
            this.dataGridView1.Size = new System.Drawing.Size(1435, 572);
            this.dataGridView1.TabIndex = 5;
            // 
            // bW
            // 
            this.bW.Location = new System.Drawing.Point(15, 90);
            this.bW.Name = "bW";
            this.bW.Size = new System.Drawing.Size(270, 22);
            this.bW.TabIndex = 6;
            this.bW.TextChanged += new System.EventHandler(this.bW_TextChanged);
            // 
            // KhoangCach
            // 
            this.KhoangCach.Location = new System.Drawing.Point(342, 90);
            this.KhoangCach.Name = "KhoangCach";
            this.KhoangCach.Size = new System.Drawing.Size(269, 22);
            this.KhoangCach.TabIndex = 7;
            this.KhoangCach.TextChanged += new System.EventHandler(this.KhoangCach_TextChanged);
            // 
            // diemPhucVu
            // 
            this.diemPhucVu.Location = new System.Drawing.Point(667, 90);
            this.diemPhucVu.Name = "diemPhucVu";
            this.diemPhucVu.Size = new System.Drawing.Size(263, 22);
            this.diemPhucVu.TabIndex = 8;
            this.diemPhucVu.TextChanged += new System.EventHandler(this.diemPhucVu_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 125);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(207, 17);
            this.label1.TabIndex = 9;
            this.label1.Text = "nhập 1/2 độ rộng của búp sóng";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(339, 125);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(302, 17);
            this.label2.TabIndex = 10;
            this.label2.Text = "nhập khoảng cách xa nhất từ một mẫu đến cell";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(664, 125);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(250, 17);
            this.label3.TabIndex = 11;
            this.label3.Text = "số điệm phục vụ nhỏ nhất của mọt cell";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // linkResult
            // 
            this.linkResult.Location = new System.Drawing.Point(963, 89);
            this.linkResult.Name = "linkResult";
            this.linkResult.Size = new System.Drawing.Size(224, 22);
            this.linkResult.TabIndex = 13;
            this.linkResult.Text = "C:\\Users\\cuncon\\Desktop";
            this.linkResult.TextChanged += new System.EventHandler(this.linkResult_TextChanged);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(963, 125);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(237, 17);
            this.label4.TabIndex = 14;
            this.label4.Text = "nhập đường dẫn muốn chứa kết quả";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1459, 788);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.linkResult);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.diemPhucVu);
            this.Controls.Add(this.KhoangCach);
            this.Controls.Add(this.bW);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.timCheoCell);
            this.Controls.Add(this.linkScan);
            this.Controls.Add(this.linkCell);
            this.Controls.Add(this.nhapScan);
            this.Controls.Add(this.nhapCell);
            this.ForeColor = System.Drawing.SystemColors.HotTrack;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.Name = "Form1";
            this.Text = "TMC - swapCellTool";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button nhapCell;
        private System.Windows.Forms.Button nhapScan;
        private System.Windows.Forms.TextBox linkCell;
        private System.Windows.Forms.TextBox linkScan;
        private System.Windows.Forms.Button timCheoCell;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.TextBox bW;
        private System.Windows.Forms.TextBox KhoangCach;
        private System.Windows.Forms.TextBox diemPhucVu;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox linkResult;
        private System.Windows.Forms.Label label4;
    }
}

