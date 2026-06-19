# TechHire India - MERN Job Portal

A full-stack MERN (MongoDB, Express.js, React, Node.js) job portal application for connecting IT professionals with top tech companies in India.

## 🚀 Features

### ✅ Completed Features
- **Authentication System**: Login and signup with JWT tokens
- **Job Browsing**: Advanced filtering and search functionality
- **Job Applications**: Complete application form with file uploads
- **User Dashboard**: Personal dashboard with application tracking
- **Applications Management**: View and track all job applications
- **Responsive Design**: Mobile-friendly interface
- **Modern UI**: Clean, professional design with animations

### 🔧 Technical Stack
- **Frontend**: React.js with React Router
- **Backend**: Node.js with Express.js
- **Database**: MongoDB with Mongoose
- **Authentication**: JWT (JSON Web Tokens)
- **Styling**: CSS with custom variables and Font Awesome icons
- **HTTP Client**: Axios for API calls

## 📁 Project Structure

```
techhire-india/
├── backend/
│   ├── models/
│   │   └── User.js          # User model with authentication
│   ├── server.js            # Main Express server
│   ├── package.json         # Backend dependencies
│   └── .env                 # Environment variables
├── frontend/
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   │   ├── Auth.js      # Login/Signup component
│   │   │   ├── Home.js      # Homepage component
│   │   │   ├── Jobs.js      # Jobs listing with filters
│   │   │   ├── JobsDetails.js # Individual job details
│   │   │   ├── Apply.js     # Job application form
│   │   │   ├── Applications.js # User's applications
│   │   │   ├── Dashboard.js # User dashboard
│   │   │   └── ...          # Other components
│   │   ├── App.js           # Main app with routing
│   │   └── styles.css       # Complete styling
│   └── package.json         # Frontend dependencies
└── README.md
```

## 🛠️ Setup Instructions

### Prerequisites
- Node.js (v16 or higher)
- MongoDB (local or cloud instance)
- npm or yarn

### Backend Setup

1. **Navigate to backend directory:**
   ```bash
   cd backend
   ```

2. **Install dependencies:**
   ```bash
   npm install
   ```

3. **Environment Setup:**
   Create a `.env` file in the backend directory:
   ```env
   PORT=5000
   MONGODB_URI=mongodb://localhost:27017/mernapp
   JWT_SECRET=your-super-secret-jwt-key-here
   ```

4. **Start MongoDB:**
   Make sure MongoDB is running on your system.

5. **Start the backend server:**
   ```bash
   npm start
   ```
   The server will run on http://localhost:5000

### Frontend Setup

1. **Navigate to frontend directory:**
   ```bash
   cd frontend
   ```

2. **Install dependencies:**
   ```bash
   npm install
   ```

3. **Start the React development server:**
   ```bash
   npm start
   ```
   The app will open at http://localhost:3000

## 🔐 Authentication Features

### User Registration
- Full name, email, password validation
- Password confirmation
- Terms and conditions agreement
- Automatic login after registration

### User Login
- Email/password authentication
- "Remember me" functionality
- Password visibility toggle
- JWT token-based sessions

### Protected Routes
- Dashboard access requires authentication
- Job applications require login
- Automatic redirects for unauthorized access

## 💼 Job Portal Features

### Job Browsing
- Search by keywords, location, company
- Filter by job type, experience level, salary range
- Sort by date, relevance, company
- Pagination support

### Job Applications
- Comprehensive application form
- Resume/CV upload
- Professional information collection
- Portfolio and social links
- Application status tracking

### User Dashboard
- Application statistics
- Recent applications overview
- Quick action buttons
- Profile management

## 🎨 UI/UX Design

### Design System
- Modern gradient themes
- Consistent color palette
- Font Awesome icons
- Smooth animations and transitions
- Mobile-responsive layout

### Components
- Reusable form components
- Status indicators
- Loading states
- Error handling
- Success notifications

## 📊 API Endpoints

### Authentication
- `POST /api/auth/register` - User registration
- `POST /api/auth/login` - User login
- `GET /api/auth/profile` - Get user profile

### Jobs
- `GET /api/jobs` - Get all jobs with filtering

### Applications
- `POST /api/applications` - Submit job application
- `GET /api/applications` - Get user's applications

## 🔒 Security Features

- Password hashing with bcrypt
- JWT token authentication
- Input validation and sanitization
- CORS protection
- Secure headers

## 🚀 Deployment

### Backend Deployment
1. Set environment variables for production
2. Use a production MongoDB instance (MongoDB Atlas)
3. Configure proper CORS origins
4. Set up SSL certificates

### Frontend Deployment
1. Build the production bundle: `npm run build`
2. Serve static files from `build` directory
3. Configure routing for SPA (handle 404s)

## 🐛 Troubleshooting

### Common Issues

1. **MongoDB Connection Error**
   - Ensure MongoDB is running
   - Check connection string in `.env`

2. **CORS Errors**
   - Update CORS origins in backend
   - Check network/firewall settings

3. **Authentication Issues**
   - Verify JWT_SECRET is set
   - Check token expiration
   - Clear localStorage if needed

4. **Build Errors**
   - Clear node_modules and reinstall
   - Check Node.js version compatibility

## 📝 Development Notes

### Adding New Features
1. Create components in `frontend/src/components/`
2. Add routes in `App.js`
3. Implement backend API endpoints
4. Update database models as needed

### Code Style
- Use functional components with hooks
- Follow React best practices
- Maintain consistent naming conventions
- Add proper error handling

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License.

## 📞 Support

For support or questions, please contact the development team or create an issue in the repository.

---

**TechHire India** - Connecting India's best IT talent with leading tech companies! 🚀

## Technology Stack

- **Frontend**: React, React Router, Axios, Font Awesome
- **Backend**: Node.js, Express.js, MongoDB, Mongoose
- **Styling**: CSS with CSS Variables, Responsive Design

## Next Steps

- Implement authentication system
- Add job CRUD operations
- Create user profiles and applications
- Add search and filtering functionality
- Deploy to production